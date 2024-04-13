package ie.shannen.runningrace.controller;

import ie.shannen.runningrace.controller.model.*;
import ie.shannen.runningrace.service.RaceService;
import ie.shannen.runningrace.service.ResultService;
import ie.shannen.runningrace.service.RunnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
public class ThymeleafController {

    private final RaceService raceService;
    private final RunnerService runnerService;
    private final ResultService resultService;

    @Autowired
    public ThymeleafController(RaceService raceService, RunnerService runnerService, ResultService resultService) {
        this.raceService = raceService;
        this.runnerService = runnerService;
        this.resultService = resultService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Race> races = raceService.getRaces();
        List<String> raceStrings = races.stream().map(Race::toString).toList();

        List<Runner> runners = runnerService.getRunners();
        List<String> runnerStrings = runners.stream().map(Runner::toString).toList();

        model.addAttribute("raceStrings", raceStrings);
        model.addAttribute("races", races);
        model.addAttribute("runnerStrings", runnerStrings);
        model.addAttribute("runners", runners);

        model.addAttribute("race", new Race());
        model.addAttribute("runner", new Runner());
        model.addAttribute("result", new ResultRequest());

        return "running_race";
    }

    @PostMapping("/addRace")
    public String addRace(@ModelAttribute @Valid Race race) {
        raceService.addRace(race);
        return "redirect:/";
    }

    @PostMapping("/addResult")
    public String addResult(@ModelAttribute @Valid ResultRequest resultRequest) {
        resultService.addResult(resultRequest);
        return "redirect:/";
    }

    @PostMapping("/addRunner")
    public String addRunner(@ModelAttribute @Valid Runner runner) {
        runnerService.addRunner(runner);
        return "redirect:/";
    }

    @GetMapping("/getRaceRunners")
    public String getRaceDetails(@RequestParam UUID id, Model model) {
        List<RaceResult> raceResults = resultService.getRaceRunners(id);
        List<String> resultStrings = raceResults.stream().map(RaceResult::toString).toList();
        RaceResultAvg avgTime = resultService.getRaceResultAvg(id);
        List<Race> races = raceService.getRaces();

        model.addAttribute("currentRace", races.stream().filter((Race race) -> race.getId().equals(id)).findFirst().orElse(null));
        model.addAttribute("races", races);
        model.addAttribute("resultStrings", resultStrings);
        model.addAttribute("averageTime", avgTime.getAvgTime() + " minutes");

        model.addAttribute("race", new Race());

        return "results";
    }

}

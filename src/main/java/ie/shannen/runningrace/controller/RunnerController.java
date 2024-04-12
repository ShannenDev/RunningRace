package ie.shannen.runningrace.controller;

import ie.shannen.runningrace.controller.model.Runner;
import ie.shannen.runningrace.service.RunnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/runner")
public class RunnerController {

    private final RunnerService runnerService;

    @Autowired
    public RunnerController(RunnerService runnerService) {
        this.runnerService = runnerService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public @ResponseBody Runner addRunner(@Valid @RequestBody Runner runner) {
        return runnerService.addRunner(runner);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Runner> getRunners() {
        return runnerService.getRunners();
    }
}

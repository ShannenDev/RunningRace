package ie.shannen.runningrace.controller;

import ie.shannen.runningrace.controller.model.RaceResult;
import ie.shannen.runningrace.controller.model.RaceResultAvg;
import ie.shannen.runningrace.controller.model.ResultRequest;
import ie.shannen.runningrace.controller.model.ResultResponse;
import ie.shannen.runningrace.service.ResultService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/result")
public class ResultController {
    private final ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public @ResponseBody ResultResponse addResult(@Valid @RequestBody ResultRequest result) {
        return resultService.addResult(result);
    }

    @GetMapping(value = "/race/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<RaceResult> getRaceRunners(@PathVariable UUID id) {
        return resultService.getRaceRunners(id);
    }

    @GetMapping(value = "/race/{id}/avg", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public RaceResultAvg getAverageTime(@PathVariable UUID id) {
        return resultService.getRaceResultAvg(id);
    }
}

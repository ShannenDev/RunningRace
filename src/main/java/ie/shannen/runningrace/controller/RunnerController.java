package ie.shannen.runningrace.controller;

import ie.shannen.runningrace.controller.model.Runner;
import ie.shannen.runningrace.service.RunnerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class RunnerController {

    private final RunnerService runnerService;

    @Autowired
    public RunnerController(RunnerService runnerService) {
        this.runnerService = runnerService;
    }

    @PostMapping(value = "/addRunner", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public @ResponseBody Runner addRunner(@Valid @RequestBody Runner runner) {
        return runnerService.addRunner(runner);
    }
}

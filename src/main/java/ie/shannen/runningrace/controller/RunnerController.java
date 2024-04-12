package ie.shannen.runningrace.controller;

import ie.shannen.runningrace.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RunnerController {

    private RunnerService runnerService;

    @Autowired
    public RunnerController(RunnerService runnerService) {
        this.runnerService = runnerService;
    }
}

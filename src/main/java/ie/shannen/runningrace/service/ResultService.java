package ie.shannen.runningrace.service;

import ie.shannen.runningrace.repository.RaceRepository;
import ie.shannen.runningrace.repository.ResultRepository;
import ie.shannen.runningrace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultService {
    private ResultRepository resultRepository;
    private RaceRepository raceRepository;
    private RunnerRepository runnerRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository, RaceRepository raceRepository, RunnerRepository runnerRepository) {
        this.resultRepository = resultRepository;
        this.raceRepository = raceRepository;
        this.runnerRepository = runnerRepository;
    }
}

package ie.shannen.runningrace.service;

import ie.shannen.runningrace.controller.model.Runner;
import ie.shannen.runningrace.converter.RunnerConverter;
import ie.shannen.runningrace.repository.RunnerRepository;
import ie.shannen.runningrace.repository.model.RunnerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RunnerService {
    private final RunnerRepository runnerRepository;

    @Autowired
    public RunnerService(RunnerRepository runnerRepository) {
        this.runnerRepository = runnerRepository;
    }

    public Runner addRunner(Runner runner) {
        RunnerEntity runnerEntity = RunnerConverter.dtoToEntity(runner);

        runnerEntity.setId(UUID.randomUUID());
        RunnerEntity savedEntity = runnerRepository.save(runnerEntity);

        return RunnerConverter.entityToDto(savedEntity);
    }

    public List<Runner> getRunners() {
        List<RunnerEntity> runnerEntities = new ArrayList<>();
        runnerRepository.findAll().forEach(runnerEntities::add);
        return RunnerConverter.entityListToDtoList(runnerEntities);
    }
}

package ie.shannen.runningrace.service;

import ie.shannen.runningrace.controller.model.RaceResult;
import ie.shannen.runningrace.controller.model.RaceResultAvg;
import ie.shannen.runningrace.controller.model.ResultRequest;
import ie.shannen.runningrace.controller.model.ResultResponse;
import ie.shannen.runningrace.converter.ResultConverter;
import ie.shannen.runningrace.exception.InternalServerException;
import ie.shannen.runningrace.exception.NotFoundException;
import ie.shannen.runningrace.repository.RaceRepository;
import ie.shannen.runningrace.repository.ResultRepository;
import ie.shannen.runningrace.repository.RunnerRepository;
import ie.shannen.runningrace.repository.model.RaceEntity;
import ie.shannen.runningrace.repository.model.ResultEntity;
import ie.shannen.runningrace.repository.model.RunnerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ResultService {
    private final ResultRepository resultRepository;
    private final RaceRepository raceRepository;
    private final RunnerRepository runnerRepository;

    @Autowired
    public ResultService(ResultRepository resultRepository, RaceRepository raceRepository, RunnerRepository runnerRepository) {
        this.resultRepository = resultRepository;
        this.raceRepository = raceRepository;
        this.runnerRepository = runnerRepository;
    }

    public ResultResponse addResult(ResultRequest result) {
        RaceEntity race = raceRepository.findById(result.getRaceId())
                .orElseThrow(() -> new NotFoundException("Race not found with id: " + result.getRaceId()));
        RunnerEntity runner = runnerRepository.findById(result.getRunnerId())
                .orElseThrow(() -> new NotFoundException("Runner not found with id: " + result.getRunnerId()));

        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setRaceEntity(race);
        resultEntity.setRunnerEntity(runner);
        resultEntity.setTime(result.getTime());
        resultEntity.setId(UUID.randomUUID());
        ResultEntity savedResult = resultRepository.save(resultEntity);

        return ResultConverter.entityToDto(savedResult);
    }

    public List<RaceResult> getRaceRunners(UUID id) {
        return ResultConverter.entityListToDtoList(getRaceResults(id));
    }

    public RaceResultAvg getRaceResultAvg(UUID id) {
        List<ResultEntity> resultEntities = getRaceResults(id);
        double avgTime = resultEntities.stream().mapToDouble(ResultEntity::getTime).average()
                .orElseThrow(() -> new InternalServerException("Unexpected error happened for race: " + id));
        return new RaceResultAvg(avgTime);
    }

    private List<ResultEntity> getRaceResults(UUID raceId) {
        List<ResultEntity> resultEntities = new ArrayList<>();
        resultRepository.findAllByRaceId(raceId).forEach(resultEntities::add);
        return resultEntities;
    }
}

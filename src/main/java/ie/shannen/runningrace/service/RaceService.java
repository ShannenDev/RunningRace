package ie.shannen.runningrace.service;

import ie.shannen.runningrace.controller.model.Race;
import ie.shannen.runningrace.converter.RaceConverter;
import ie.shannen.runningrace.repository.RaceRepository;
import ie.shannen.runningrace.repository.model.RaceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RaceService {
    private final RaceRepository raceRepository;

    @Autowired
    public RaceService(RaceRepository raceRepository) {
        this.raceRepository = raceRepository;
    }

    public Race addRace(Race race) {
        RaceEntity raceEntity = RaceConverter.dtoToEntity(race);

        raceEntity.setId(UUID.randomUUID());
        RaceEntity savedEntity = raceRepository.save(raceEntity);

        return RaceConverter.entityToDto(savedEntity);
    }
}

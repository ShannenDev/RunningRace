package ie.shannen.runningrace.service;

import ie.shannen.runningrace.controller.model.Race;
import ie.shannen.runningrace.converter.RaceConverter;
import ie.shannen.runningrace.exception.NotFoundException;
import ie.shannen.runningrace.repository.RaceRepository;
import ie.shannen.runningrace.repository.model.RaceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<Race> getRaces() {
        List<RaceEntity> raceEntities = new ArrayList<>();
        raceRepository.findAll().forEach(raceEntities::add);
        return RaceConverter.entityListToDtoList(raceEntities);
    }

    public Race updateRace(UUID id, Race race) {
        RaceEntity raceEntity = raceRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Race not found with id: " + id));

        raceEntity.setName(race.getName());
        raceEntity.setDistance(race.getDistance());

        RaceEntity updatedEntity = raceRepository.save(raceEntity);

        return RaceConverter.entityToDto(updatedEntity);
    }
}

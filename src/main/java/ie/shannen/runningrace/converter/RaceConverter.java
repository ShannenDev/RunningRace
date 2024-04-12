package ie.shannen.runningrace.converter;

import ie.shannen.runningrace.controller.model.Race;
import ie.shannen.runningrace.repository.model.RaceEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RaceConverter {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static Race entityToDto(RaceEntity entity) {
        return modelMapper.map(entity, Race.class);
    }

    public static RaceEntity dtoToEntity(Race dto) {
        return modelMapper.map(dto, RaceEntity.class);
    }

    public static List<Race> entityListToDtoList(List<RaceEntity> entities) {
        return entities.stream().map(RaceConverter::entityToDto).collect(Collectors.toList());
    }
}

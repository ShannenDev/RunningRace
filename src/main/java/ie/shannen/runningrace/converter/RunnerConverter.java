package ie.shannen.runningrace.converter;

import ie.shannen.runningrace.controller.model.Runner;
import ie.shannen.runningrace.repository.model.RunnerEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class RunnerConverter {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static Runner entityToDto(RunnerEntity entity) {
        return modelMapper.map(entity, Runner.class);
    }

    public static RunnerEntity dtoToEntity(Runner dto) {
        return modelMapper.map(dto, RunnerEntity.class);
    }

    public static List<Runner> entityListToDtoList(List<RunnerEntity> entities) {
        return entities.stream().map(RunnerConverter::entityToDto).collect(Collectors.toList());
    }
}

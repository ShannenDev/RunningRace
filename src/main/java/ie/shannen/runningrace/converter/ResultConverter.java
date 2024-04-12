package ie.shannen.runningrace.converter;

import ie.shannen.runningrace.controller.model.ResultResponse;
import ie.shannen.runningrace.repository.model.ResultEntity;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ResultConverter {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static ResultResponse entityToDto(ResultEntity entity) {
        return modelMapper.map(entity, ResultResponse.class);
    }

    public static List<ResultResponse> entityListToDtoList(List<ResultEntity> entities) {
        return entities.stream().map(ResultConverter::entityToDto).collect(Collectors.toList());
    }
}

package ie.shannen.runningrace.converter;

import ie.shannen.runningrace.controller.model.RaceResult;
import ie.shannen.runningrace.controller.model.ResultResponse;
import ie.shannen.runningrace.repository.model.ResultEntity;
import org.modelmapper.ModelMapper;

import java.util.List;

public class ResultConverter {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static ResultResponse entityToDto(ResultEntity entity) {
        return modelMapper.map(entity, ResultResponse.class);
    }

    public static List<RaceResult> entityListToDtoList(List<ResultEntity> entities) {
        return entities.stream().map(entity -> new RaceResult(entity.getRunnerEntity().getName(), entity.getTime())).toList();
    }
}

package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class ResultRequest {
    @NotNull
    private UUID runnerId;

    @NotNull
    private UUID raceId;

    @NotNull
    private Double time;
}

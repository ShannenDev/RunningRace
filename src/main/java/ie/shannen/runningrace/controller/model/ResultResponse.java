package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class ResultResponse {
    private UUID id;

    @NotNull
    private UUID runnerId;

    @NotNull
    private UUID raceId;

    @NotBlank
    private Long time;
}

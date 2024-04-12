package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
public class ResultRequest {
    private UUID id;

    @NotNull
    private Runner runner;

    @NotNull
    private Race race;

    @NotBlank
    private Long time;
}

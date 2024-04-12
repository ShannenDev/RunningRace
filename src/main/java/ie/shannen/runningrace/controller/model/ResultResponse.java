package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@Data
public class ResultResponse {
    private UUID id;

    @NotNull
    private Runner runner;

    @NotNull
    private Race race;

    @NotNull
    private Double time;
}

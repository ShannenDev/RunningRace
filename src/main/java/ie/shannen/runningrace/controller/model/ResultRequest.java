package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@Data
public class ResultRequest {
    @NotNull
    private UUID runnerId;

    @NotNull
    private UUID raceId;

    @NotNull
    @Min(0)
    private Double time;
}

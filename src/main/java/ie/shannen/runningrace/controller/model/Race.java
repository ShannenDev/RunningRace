package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Race {
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private Double distance;
}

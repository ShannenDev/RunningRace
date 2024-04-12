package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Race {
    private UUID id;

    @NotBlank
    private String name;

    @NotNull
    private Double distance;
}

package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Data
public class Race {
    @Null
    private UUID id;

    @NotBlank
    private String name;

    @NotNull
    private Double distance;
}

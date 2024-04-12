package ie.shannen.runningrace.controller.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Runner {
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private Integer age;

    @NotBlank
    private String sex;
}

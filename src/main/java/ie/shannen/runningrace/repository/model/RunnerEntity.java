package ie.shannen.runningrace.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class RunnerEntity {
    @Id
    private UUID id;

    private String name;
    private Integer age;
    private String gender;
}

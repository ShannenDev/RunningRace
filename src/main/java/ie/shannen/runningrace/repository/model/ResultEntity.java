package ie.shannen.runningrace.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class ResultEntity {
    @Id
    private UUID id;

    @OneToOne
    private RunnerEntity runnerEntity;

    @ManyToOne
    private RaceEntity raceEntity;

    private Double time;
}

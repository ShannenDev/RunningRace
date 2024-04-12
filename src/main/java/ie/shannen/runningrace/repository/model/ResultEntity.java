package ie.shannen.runningrace.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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

    @OneToOne
    private RaceEntity raceEntity;

    private Long time;
}

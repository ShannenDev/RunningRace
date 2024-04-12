package ie.shannen.runningrace.repository;

import ie.shannen.runningrace.repository.model.RunnerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RunnerRepository extends CrudRepository<RunnerEntity, UUID> {

}

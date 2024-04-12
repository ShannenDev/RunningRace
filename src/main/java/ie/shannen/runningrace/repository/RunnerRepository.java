package ie.shannen.runningrace.repository;

import ie.shannen.runningrace.repository.model.RunnerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RunnerRepository extends CrudRepository<RunnerEntity, UUID> {

}

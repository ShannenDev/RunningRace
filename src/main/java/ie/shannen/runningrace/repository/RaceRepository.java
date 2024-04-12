package ie.shannen.runningrace.repository;

import ie.shannen.runningrace.repository.model.RaceEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RaceRepository extends CrudRepository<RaceEntity, UUID> {

}

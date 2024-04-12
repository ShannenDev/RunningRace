package ie.shannen.runningrace.repository;

import ie.shannen.runningrace.repository.model.ResultEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ResultRepository extends CrudRepository<ResultEntity, UUID> {

}

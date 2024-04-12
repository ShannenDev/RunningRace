package ie.shannen.runningrace.repository;

import ie.shannen.runningrace.repository.model.ResultEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ResultRepository extends CrudRepository<ResultEntity, UUID> {

}

package by.sjc.bez100percent.repo;

import by.sjc.bez100percent.model.ModuleType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by desperado on 14.8.15.
 */
@Repository
public interface ModuleTypeRepository extends CrudRepository<ModuleType, Long>{

}

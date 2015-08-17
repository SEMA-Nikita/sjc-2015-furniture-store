package by.sjc.bez100percent.repo;

import by.sjc.bez100percent.model.Module;
import by.sjc.bez100percent.model.ModuleType;
import by.sjc.bez100percent.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by desperado on 14.8.15.
 */
@Repository
public interface ModuleRepository extends CrudRepository<Module, Long>{

    Module findOneByProductAndModuleType(Product product, ModuleType moduleType);
}

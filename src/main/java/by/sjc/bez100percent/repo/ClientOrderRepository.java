package by.sjc.bez100percent.repo;

import by.sjc.bez100percent.model.ClientOrder;
import by.sjc.bez100percent.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by desperado on 14.8.15.
 */
@Repository
public interface ClientOrderRepository extends CrudRepository<ClientOrder, Long>{

}

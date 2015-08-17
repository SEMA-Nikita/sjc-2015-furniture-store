package by.sjc.bez100percent.service;

import by.sjc.bez100percent.dto.ProductDto;
import by.sjc.bez100percent.model.*;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by desperado on 14.8.15.
 */
public interface ProductService {

    Iterable<ProductType> getAllProductTypes();

    ClientOrder orderProduct(String productTypeCode, User user);

}

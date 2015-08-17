package by.sjc.bez100percent.service.impl;

import by.sjc.bez100percent.model.*;
import by.sjc.bez100percent.repo.ClientOrderRepository;
import by.sjc.bez100percent.repo.ProductRepository;
import by.sjc.bez100percent.repo.ProductTypeRepository;
import by.sjc.bez100percent.service.FinanceService;
import by.sjc.bez100percent.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by desperado on 14.8.15.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ClientOrderRepository clientOrderRepository;

    @Autowired
    private FinanceService financeService;

    @Override
    public Iterable<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

    @Override
    public ClientOrder orderProduct(String productTypeCode, User user) {

        ProductType productType = productTypeRepository.findByCode(productTypeCode);

        Product product = new Product();
        product.setProductType(productType);
//        TODO cost formation
        product.setCost(financeService.getCostByProductType(productType));
        product = productRepository.save(product);

        ClientOrder order = new ClientOrder();
        order.setProduct(product);
        order.setStartDate(new Date());
        order.setStatus(Status.CHECKING);
        order.setCustomer(user);
//        TODO
        order.setCredit(financeService.createCredit(user));


        return clientOrderRepository.save(order);
    }
}

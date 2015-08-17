package by.sjc.bez100percent.controller;

/**
 * Created by desperado on 13.8.15.
 */

import by.sjc.bez100percent.dto.ModuleDto;
import by.sjc.bez100percent.dto.ProductDto;
import by.sjc.bez100percent.model.ClientOrder;
import by.sjc.bez100percent.model.ModuleType;
import by.sjc.bez100percent.model.ProductType;
import by.sjc.bez100percent.model.User;
import by.sjc.bez100percent.service.ModuleService;
import by.sjc.bez100percent.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatalogController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ModuleService moduleService;


    @RequestMapping("/products/list")
    public List<ProductDto> listProducts() {
        List<ProductDto> result = new ArrayList<>();

//        TODO pagination
//        for (ProductType productType : productService.getAllProductTypes()) {
//            ProductDto dto = new ProductDto();
//            dto.setId(productType.getId());
//            dto.setCode(productType.getCode());
//            dto.setName(productType.getName());
//        }

        for (int i = 0; i < 5; i++) {
            ProductDto dto = new ProductDto();
            dto.setId((long) i);
            dto.setCode("code" + i);
            dto.setName("product" + i);
            result.add(dto);
        }

        return result;
    }

    @RequestMapping("/products/modules")
    @ResponseBody
    public List<ModuleDto> listProductModules(@RequestParam Long productTypeId) {
        List<ModuleDto> result = new ArrayList<>();

//        TODO .getAllProductTypesPage(page, count);
//        for (ModuleType moduleType : moduleService.getProductTypeModules(productTypeCode)) {
//            ProductDto dto = new ProductDto();
//            dto.setId(moduleType.getId());
//            dto.setCode(moduleType.getCode());
//            dto.setName(moduleType.getName());
//        }
        for (int i = 0; i < 5; i++) {
            ModuleDto dto = new ModuleDto();
            dto.setId((long) i);
            dto.setCode(productTypeId + "code" + i);
            dto.setName(productTypeId + "module" + i);
            result.add(dto);
        }

        return result;
    }

    @RequestMapping("/products/order")
    public List<ProductDto> orderProduct(@RequestParam String productTypeCode, @RequestParam User user) {
        List<ProductDto> result = new ArrayList<>();

        ClientOrder order = productService.orderProduct(productTypeCode, user);


        return result;
    }
}

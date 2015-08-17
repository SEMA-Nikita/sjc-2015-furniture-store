package by.sjc.bez100percent.dto;

import by.sjc.bez100percent.model.Entity;
import by.sjc.bez100percent.model.ProductType;

/**
 * Created by desperado on 14.8.15.
 */
public class ProductDto {

    private Long id;

    private String productType;

    private String name;

    private String code;

    private float cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

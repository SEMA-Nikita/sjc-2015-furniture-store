package by.sjc.bez100percent.model;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class SupplierOrder extends Order {

    private float shippingCost;

    @OneToMany
    private List<Module> modules;

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}

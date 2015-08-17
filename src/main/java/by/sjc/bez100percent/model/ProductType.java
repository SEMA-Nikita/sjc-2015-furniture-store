package by.sjc.bez100percent.model;

import sun.security.pkcs11.Secmod;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class ProductType extends Entity {

    private String name;

    private String code;

    @OneToMany(fetch = FetchType.EAGER)
    private List<ModuleType> moduleTypes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ModuleType> getModuleTypes() {
        return moduleTypes;
    }

    public void setModuleTypes(List<ModuleType> moduleTypes) {
        this.moduleTypes = moduleTypes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

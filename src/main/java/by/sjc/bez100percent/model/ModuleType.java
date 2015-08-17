package by.sjc.bez100percent.model;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class ModuleType extends Entity {

    private String name;

    private String code;

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
}

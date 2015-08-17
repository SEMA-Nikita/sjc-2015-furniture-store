package by.sjc.bez100percent.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class User extends Entity {

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

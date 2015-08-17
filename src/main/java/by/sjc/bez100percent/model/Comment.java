package by.sjc.bez100percent.model;

import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class Comment extends Entity {

    @Lob
    private String text;

    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

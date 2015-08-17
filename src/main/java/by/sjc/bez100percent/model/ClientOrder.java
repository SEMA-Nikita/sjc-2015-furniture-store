package by.sjc.bez100percent.model;

import javax.persistence.OneToOne;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class ClientOrder extends Order {

    @OneToOne
    private Credit credit;

    @OneToOne
    private Product product;

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

package by.sjc.bez100percent.model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class Payment extends Entity {

    private float sum;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne
    private Credit credit;

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}

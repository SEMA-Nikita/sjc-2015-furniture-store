package by.sjc.bez100percent.model;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by desperado on 14.8.15.
 */
@javax.persistence.Entity
public class Credit extends Entity {

    private float fullSum;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    public float getFullSum() {
        return fullSum;
    }

    public void setFullSum(float fullSum) {
        this.fullSum = fullSum;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

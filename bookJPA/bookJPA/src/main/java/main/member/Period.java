package main.member;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class Period {
    @Temporal(TemporalType.DATE)
    java.util.Date startDate;
    @Temporal(TemporalType.DATE)
    java.util.Date endDate;

    public boolean isWork(Date date){
        return false;
    }
}

package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PurchaseApproved extends AbstractEvent {

    private Long id;
    private String userId;
    private String item;
    private Long amount;
    private String status;
    private Date createdAt;

    public PurchaseApproved(Payment aggregate) {
        super(aggregate);
    }

    public PurchaseApproved() {
        super();
    }
}
//>>> DDD / Domain Event

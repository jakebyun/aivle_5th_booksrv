package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Subscribed extends AbstractEvent {

    private Long id;
    private String userId;
    private String item;
    private Long amount;
    private String status;
    private Date createdAt;

    public Subscribed(Payment aggregate) {
        super(aggregate);
    }

    public Subscribed() {
        super();
    }
}
//>>> DDD / Domain Event

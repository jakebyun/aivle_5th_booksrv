package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AlertSearch extends AbstractEvent {

    private Long id;
    private Integer userId;
    private String message;
    private Boolean isRead;
    private Date createdAt;

    public AlertSearch(알림 aggregate) {
        super(aggregate);
    }

    public AlertSearch() {
        super();
    }
}
//>>> DDD / Domain Event

package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WriteCompleted extends AbstractEvent {

    private Long id;
    private String authorId;
    private String title;
    private String content;
    private String status;

    public WriteCompleted(PublishScript aggregate) {
        super(aggregate);
    }

    public WriteCompleted() {
        super();
    }
}
//>>> DDD / Domain Event

package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WriteDeleted extends AbstractEvent {

    private Long id;
    private String authorId;
    private String title;
    private String content;
    private String status;

    public WriteDeleted(PublishScript aggregate) {
        super(aggregate);
    }

    public WriteDeleted() {
        super();
    }
}
//>>> DDD / Domain Event

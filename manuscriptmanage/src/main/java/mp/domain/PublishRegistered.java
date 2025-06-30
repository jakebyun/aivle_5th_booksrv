package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PublishRegistered extends AbstractEvent {

    private Long id;
    private String authorId;
    private String content;
    private String title;
    private String status;

    public PublishRegistered(PublishScript aggregate) {
        super(aggregate);
    }

    public PublishRegistered() {
        super();
    }
}
//>>> DDD / Domain Event

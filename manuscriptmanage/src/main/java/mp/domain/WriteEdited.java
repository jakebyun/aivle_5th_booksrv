package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WriteEdited extends AbstractEvent {

    private Long id;
    private String authorId;
    private String content;
    private String title;
    private String status;

    public WriteEdited(PublishScript aggregate) {
        super(aggregate);
    }

    public WriteEdited() {
        super();
    }
}
//>>> DDD / Domain Event

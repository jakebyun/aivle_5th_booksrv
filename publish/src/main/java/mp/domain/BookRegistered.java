package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookRegistered extends AbstractEvent {

    private Long id;
    private String authorId;
    private String title;
    private String category;
    private String content;
    private String summary;
    private String audioUrl;
    private String imageUrl;
    private String todayCount;
    private String totalCount;

    public BookRegistered(PublishBook aggregate) {
        super(aggregate);
    }

    public BookRegistered() {
        super();
    }
}
//>>> DDD / Domain Event

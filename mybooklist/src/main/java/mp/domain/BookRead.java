package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookRead extends AbstractEvent {

    private Long id;
    private String userId;
    private String bookId;

    public BookRead(Book aggregate) {
        super(aggregate);
    }

    public BookRead() {
        super();
    }
}
//>>> DDD / Domain Event

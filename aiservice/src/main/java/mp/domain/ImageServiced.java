package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ImageServiced extends AbstractEvent {

    private Long id;
    private String log;

    public ImageServiced(Service aggregate) {
        super(aggregate);
    }

    public ImageServiced() {
        super();
    }
}
//>>> DDD / Domain Event

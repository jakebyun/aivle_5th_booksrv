package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Publishwrited extends AbstractEvent {

    private Long id;
    private String log;

    public Publishwrited(Service aggregate) {
        super(aggregate);
    }

    public Publishwrited() {
        super();
    }
}
//>>> DDD / Domain Event

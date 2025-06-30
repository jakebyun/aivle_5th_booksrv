package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MakeAudiobooked extends AbstractEvent {

    private Long id;
    private String log;

    public MakeAudiobooked(Service aggregate) {
        super(aggregate);
    }

    public MakeAudiobooked() {
        super();
    }
}
//>>> DDD / Domain Event

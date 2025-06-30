package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ScriptServiced extends AbstractEvent {

    private Long id;
    private String log;

    public ScriptServiced(Service aggregate) {
        super(aggregate);
    }

    public ScriptServiced() {
        super();
    }
}
//>>> DDD / Domain Event

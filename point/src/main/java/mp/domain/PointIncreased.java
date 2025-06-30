package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointIncreased extends AbstractEvent {

    private Long id;
    private String userId;
    private Double currentPoint;
    private Double totalPoint;

    public PointIncreased(Point aggregate) {
        super(aggregate);
    }

    public PointIncreased() {
        super();
    }
}
//>>> DDD / Domain Event

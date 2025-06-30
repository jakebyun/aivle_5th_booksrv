package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointDecreased extends AbstractEvent {

    private Long id;
    private String userId;
    private Double currentPoint;
    private Double totalPoint;

    public PointDecreased(Point aggregate) {
        super(aggregate);
    }

    public PointDecreased() {
        super();
    }
}
//>>> DDD / Domain Event

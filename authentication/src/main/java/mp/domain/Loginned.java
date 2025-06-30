package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Loginned extends AbstractEvent {

    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean isSubscribed;

    public Loginned(User aggregate) {
        super(aggregate);
    }

    public Loginned() {
        super();
    }
}
//>>> DDD / Domain Event

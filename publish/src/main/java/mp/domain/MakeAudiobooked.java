package mp.domain;

import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

@Data
@ToString
public class MakeAudiobooked extends AbstractEvent {

    private Long id;
    private String log;
}

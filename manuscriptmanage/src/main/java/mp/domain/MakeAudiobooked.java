package mp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import mp.infra.AbstractEvent;

@Data
public class MakeAudiobooked extends AbstractEvent {

    private Long id;
    private String log;
}

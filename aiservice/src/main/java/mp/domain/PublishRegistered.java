package mp.domain;

import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

@Data
@ToString
public class PublishRegistered extends AbstractEvent {

    private Long id;
    private String authorId;
    private String content;
    private String title;
    private String status;
}

package mp.domain;

import java.util.*;
import lombok.*;
import mp.domain.*;
import mp.infra.AbstractEvent;

@Data
@ToString
public class AuthorEnrolled extends AbstractEvent {

    private Long id;
    private String userId;
    private String info;
    private String status;
    private String portfolioUrl;
    private String email;
}

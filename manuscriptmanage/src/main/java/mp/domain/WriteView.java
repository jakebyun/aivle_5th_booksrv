package mp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "WriteView_table")
@Data
public class WriteView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String authorId;
    private String writeStatus;
    private String serviceStatus;
    private String log;
    private String title;
    private String content;
    private String status;
}

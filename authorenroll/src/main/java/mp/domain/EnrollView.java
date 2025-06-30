package mp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "EnrollView_table")
@Data
public class EnrollView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String userId;
    private String enrollStatus;
    private String info;
    private String portfolioUrl;
    private String status;
}

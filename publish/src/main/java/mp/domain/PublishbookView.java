package mp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "PublishbookView_table")
@Data
public class PublishbookView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String summary;
    private String audioUrl;
    private String imageUrl;
    private String authorId;
    private String title;
    private String category;
    private String content;
    private String todayCount;
    private String totalCount;
    private String publishbookStatus;
}

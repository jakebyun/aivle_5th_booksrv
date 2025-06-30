package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.AuthorenrollApplication;
import mp.domain.AuditCompleted;
import mp.domain.AuthorEnrolled;

@Entity
@Table(name = "Writer_table")
@Data
//<<< DDD / Aggregate Root
public class Writer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String info;

    private String status;

    private String portfolioUrl;

    @PostPersist
    public void onPostPersist() {
        AuthorEnrolled authorEnrolled = new AuthorEnrolled(this);
        authorEnrolled.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        AuditCompleted auditCompleted = new AuditCompleted(this);
        auditCompleted.publishAfterCommit();
    }

    public static WriterRepository repository() {
        WriterRepository writerRepository = AuthorenrollApplication.applicationContext.getBean(
            WriterRepository.class
        );
        return writerRepository;
    }
}
//>>> DDD / Aggregate Root

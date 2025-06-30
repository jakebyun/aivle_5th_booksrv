package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.MybooklistApplication;
import mp.domain.BookRead;
import mp.domain.TxtBought;

@Entity
@Table(name = "Book_table")
@Data
//<<< DDD / Aggregate Root
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String bookId;

    @PostPersist
    public void onPostPersist() {
        TxtBought txtBought = new TxtBought(this);
        txtBought.publishAfterCommit();

        BookRead bookRead = new BookRead(this);
        bookRead.publishAfterCommit();
    }

    public static BookRepository repository() {
        BookRepository bookRepository = MybooklistApplication.applicationContext.getBean(
            BookRepository.class
        );
        return bookRepository;
    }
}
//>>> DDD / Aggregate Root

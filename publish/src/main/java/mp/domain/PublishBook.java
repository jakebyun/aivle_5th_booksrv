package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.PublishApplication;
import mp.domain.BookRegistered;

@Entity
@Table(name = "PublishBook_table")
@Data
//<<< DDD / Aggregate Root
public class PublishBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String authorId;

    private String title;

    private String category;

    private String content;

    private String summary;

    private String audioUrl;

    private String imageUrl;

    private String todayCount;

    private String totalCount;

    @PostPersist
    public void onPostPersist() {
        BookRegistered bookRegistered = new BookRegistered(this);
        bookRegistered.publishAfterCommit();
    }

    public static PublishBookRepository repository() {
        PublishBookRepository publishBookRepository = PublishApplication.applicationContext.getBean(
            PublishBookRepository.class
        );
        return publishBookRepository;
    }

    //<<< Clean Arch / Port Method
    public static void registerBook(MakeAudiobooked makeAudiobooked) {
        //implement business logic here:

        /** Example 1:  new item 
        PublishBook publishBook = new PublishBook();
        repository().save(publishBook);

        */

        /** Example 2:  finding and process
        

        repository().findById(makeAudiobooked.get???()).ifPresent(publishBook->{
            
            publishBook // do something
            repository().save(publishBook);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 조회수증가(BookRead bookRead) {
        //implement business logic here:

        /** Example 1:  new item 
        PublishBook publishBook = new PublishBook();
        repository().save(publishBook);

        */

        /** Example 2:  finding and process
        

        repository().findById(bookRead.get???()).ifPresent(publishBook->{
            
            publishBook // do something
            repository().save(publishBook);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.ManuscriptmanageApplication;
import mp.domain.PublishRegistered;
import mp.domain.WriteCompleted;
import mp.domain.WriteDeleted;
import mp.domain.WriteEdited;

@Entity
@Table(name = "PublishScript_table")
@Data
//<<< DDD / Aggregate Root
public class PublishScript {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String authorId;

    private String title;

    private String content;

    private String status;

    @PostPersist
    public void onPostPersist() {
        WriteCompleted writeCompleted = new WriteCompleted(this);
        writeCompleted.publishAfterCommit();

        PublishRegistered publishRegistered = new PublishRegistered(this);
        publishRegistered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        WriteEdited writeEdited = new WriteEdited(this);
        writeEdited.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        WriteDeleted writeDeleted = new WriteDeleted(this);
        writeDeleted.publishAfterCommit();
    }

    public static PublishScriptRepository repository() {
        PublishScriptRepository publishScriptRepository = ManuscriptmanageApplication.applicationContext.getBean(
            PublishScriptRepository.class
        );
        return publishScriptRepository;
    }

    //<<< Clean Arch / Port Method
    public static void scriptStatusUpdate(BookRegistered bookRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        PublishScript publishScript = new PublishScript();
        repository().save(publishScript);

        */

        /** Example 2:  finding and process
        

        repository().findById(bookRegistered.get???()).ifPresent(publishScript->{
            
            publishScript // do something
            repository().save(publishScript);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

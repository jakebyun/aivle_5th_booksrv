package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.NotificationApplication;
import mp.domain.AlertSearch;

@Entity
@Table(name = "알림_table")
@Data
//<<< DDD / Aggregate Root
public class 알림 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;

    private String message;

    private Boolean isRead;

    private Date createdAt;

    @PostPersist
    public void onPostPersist() {
        AlertSearch alertSearch = new AlertSearch(this);
        alertSearch.publishAfterCommit();
    }

    public static 알림Repository repository() {
        알림Repository 알림Repository = NotificationApplication.applicationContext.getBean(
            알림Repository.class
        );
        return 알림Repository;
    }

    //<<< Clean Arch / Port Method
    public static void notify(AuthorEnrolled authorEnrolled) {
        //implement business logic here:

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        

        repository().findById(authorEnrolled.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notify(AuditCompleted auditCompleted) {
        //implement business logic here:

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        

        repository().findById(auditCompleted.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void notify(BookRegistered bookRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        알림 알림 = new 알림();
        repository().save(알림);

        */

        /** Example 2:  finding and process
        

        repository().findById(bookRegistered.get???()).ifPresent(알림->{
            
            알림 // do something
            repository().save(알림);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

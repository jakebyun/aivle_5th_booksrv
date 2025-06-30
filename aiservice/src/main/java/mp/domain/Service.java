package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.AiserviceApplication;
import mp.domain.ImageServiced;
import mp.domain.MakeAudiobooked;
import mp.domain.Publishwrited;
import mp.domain.ScriptServiced;

@Entity
@Table(name = "Service_table")
@Data
//<<< DDD / Aggregate Root
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String log;

    public static ServiceRepository repository() {
        ServiceRepository serviceRepository = AiserviceApplication.applicationContext.getBean(
            ServiceRepository.class
        );
        return serviceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void makeImage(ScriptServiced scriptServiced) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        ImageServiced imageServiced = new ImageServiced(service);
        imageServiced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(scriptServiced.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            ImageServiced imageServiced = new ImageServiced(service);
            imageServiced.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void makeScript(Publishwrited publishwrited) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        ScriptServiced scriptServiced = new ScriptServiced(service);
        scriptServiced.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(publishwrited.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            ScriptServiced scriptServiced = new ScriptServiced(service);
            scriptServiced.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void publishWrite(PublishRegistered publishRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        Publishwrited publishwrited = new Publishwrited(service);
        publishwrited.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(publishRegistered.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            Publishwrited publishwrited = new Publishwrited(service);
            publishwrited.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 오디오북생성(ImageServiced imageServiced) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        MakeAudiobooked makeAudiobooked = new MakeAudiobooked(service);
        makeAudiobooked.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(imageServiced.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            MakeAudiobooked makeAudiobooked = new MakeAudiobooked(service);
            makeAudiobooked.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root

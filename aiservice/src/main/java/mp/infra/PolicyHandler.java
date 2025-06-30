package mp.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import mp.config.kafka.KafkaProcessor;
import mp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    ServiceRepository serviceRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ScriptServiced'"
    )
    public void wheneverScriptServiced_MakeImage(
        @Payload ScriptServiced scriptServiced
    ) {
        ScriptServiced event = scriptServiced;
        System.out.println(
            "\n\n##### listener MakeImage : " + scriptServiced + "\n\n"
        );

        // Sample Logic //
        Service.makeImage(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Publishwrited'"
    )
    public void wheneverPublishwrited_MakeScript(
        @Payload Publishwrited publishwrited
    ) {
        Publishwrited event = publishwrited;
        System.out.println(
            "\n\n##### listener MakeScript : " + publishwrited + "\n\n"
        );

        // Sample Logic //
        Service.makeScript(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PublishRegistered'"
    )
    public void wheneverPublishRegistered_PublishWrite(
        @Payload PublishRegistered publishRegistered
    ) {
        PublishRegistered event = publishRegistered;
        System.out.println(
            "\n\n##### listener PublishWrite : " + publishRegistered + "\n\n"
        );

        // Sample Logic //
        Service.publishWrite(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ImageServiced'"
    )
    public void wheneverImageServiced_오디오북생성(
        @Payload ImageServiced imageServiced
    ) {
        ImageServiced event = imageServiced;
        System.out.println(
            "\n\n##### listener 오디오북생성 : " + imageServiced + "\n\n"
        );

        // Sample Logic //
        Service.오디오북생성(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

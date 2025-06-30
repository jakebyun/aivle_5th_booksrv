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
    PublishScriptRepository publishScriptRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookRegistered'"
    )
    public void wheneverBookRegistered_ScriptStatusUpdate(
        @Payload BookRegistered bookRegistered
    ) {
        BookRegistered event = bookRegistered;
        System.out.println(
            "\n\n##### listener ScriptStatusUpdate : " + bookRegistered + "\n\n"
        );

        // Sample Logic //
        PublishScript.scriptStatusUpdate(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

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
    PublishBookRepository publishBookRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MakeAudiobooked'"
    )
    public void wheneverMakeAudiobooked_RegisterBook(
        @Payload MakeAudiobooked makeAudiobooked
    ) {
        MakeAudiobooked event = makeAudiobooked;
        System.out.println(
            "\n\n##### listener RegisterBook : " + makeAudiobooked + "\n\n"
        );

        // Sample Logic //
        PublishBook.registerBook(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='BookRead'"
    )
    public void wheneverBookRead_조회수증가(@Payload BookRead bookRead) {
        BookRead event = bookRead;
        System.out.println(
            "\n\n##### listener 조회수증가 : " + bookRead + "\n\n"
        );

        // Sample Logic //
        PublishBook.조회수증가(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

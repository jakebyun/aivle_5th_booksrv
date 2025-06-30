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
    PointRepository pointRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PurchaseApproved'"
    )
    public void wheneverPurchaseApproved_PointIncrease(
        @Payload PurchaseApproved purchaseApproved
    ) {
        PurchaseApproved event = purchaseApproved;
        System.out.println(
            "\n\n##### listener PointIncrease : " + purchaseApproved + "\n\n"
        );

        // Sample Logic //
        Point.pointIncrease(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Registered'"
    )
    public void wheneverRegistered_PointIncrease(
        @Payload Registered registered
    ) {
        Registered event = registered;
        System.out.println(
            "\n\n##### listener PointIncrease : " + registered + "\n\n"
        );

        // Sample Logic //
        Point.pointIncrease(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='TxtBought'"
    )
    public void wheneverTxtBought_PointDecrease(@Payload TxtBought txtBought) {
        TxtBought event = txtBought;
        System.out.println(
            "\n\n##### listener PointDecrease : " + txtBought + "\n\n"
        );

        // Sample Logic //
        Point.pointDecrease(event);
    }
}
//>>> Clean Arch / Inbound Adaptor

package mp.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import mp.config.kafka.KafkaProcessor;
import mp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class AlertViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private AlertViewRepository alertViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenAlertSearch_then_UPDATE_1(
        @Payload AlertSearch alertSearch
    ) {
        try {
            if (!alertSearch.validate()) return;
            // view 객체 조회

            List<AlertView> alertViewList = alertViewRepository.findByUserId(
                String.valueOf(alertSearch.getUserId())
            );
            for (AlertView alertView : alertViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                alertView.setAlertStatus(AlertSearch);
                // view 레파지 토리에 save
                alertViewRepository.save(alertView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}

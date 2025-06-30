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
public class PointViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private PointViewRepository pointViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPointIncreased_then_UPDATE_1(
        @Payload PointIncreased pointIncreased
    ) {
        try {
            if (!pointIncreased.validate()) return;
            // view 객체 조회

            List<PointView> pointViewList = pointViewRepository.findByUserId(
                pointIncreased.getUserId()
            );
            for (PointView pointView : pointViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                pointView.setPointStatus(pointIncreased);
                // view 레파지 토리에 save
                pointViewRepository.save(pointView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPointDecreased_then_UPDATE_2(
        @Payload PointDecreased pointDecreased
    ) {
        try {
            if (!pointDecreased.validate()) return;
            // view 객체 조회

            List<PointView> pointViewList = pointViewRepository.findByUserId(
                pointDecreased.getUserId()
            );
            for (PointView pointView : pointViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                pointView.setPointStatus(pointDecreased);
                // view 레파지 토리에 save
                pointViewRepository.save(pointView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}

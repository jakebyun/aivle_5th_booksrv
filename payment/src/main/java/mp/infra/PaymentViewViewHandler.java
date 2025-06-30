package mp.infra;

import mp.domain.*;
import mp.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentViewViewHandler {

//<<< DDD / CQRS
    @Autowired
    private PaymentViewRepository paymentViewRepository;



    @StreamListener(KafkaProcessor.INPUT)
    public void whenPurchaseApproved_then_UPDATE_1(@Payload PurchaseApproved purchaseApproved) {
        try {
            if (!purchaseApproved.validate()) return;
                // view 객체 조회

                List<PaymentView> paymentViewList = paymentViewRepository.findByUserId(purchaseApproved.getUserId());
                for(PaymentView paymentView : paymentViewList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    paymentView.setPaymentStatus(PurchaseApproved);
                // view 레파지 토리에 save
                paymentViewRepository.save(paymentView);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenSubscribed_then_UPDATE_2(@Payload Subscribed subscribed) {
        try {
            if (!subscribed.validate()) return;
                // view 객체 조회

                List<PaymentView> paymentViewList = paymentViewRepository.findByUserId(subscribed.getUserId());
                for(PaymentView paymentView : paymentViewList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    paymentView.setPaymentStatus(Subscribed);
                // view 레파지 토리에 save
                paymentViewRepository.save(paymentView);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (!.validate()) return;
                // view 객체 조회

                List<PaymentView> paymentViewList = paymentViewRepository.findByUserId(.getUserId());
                for(PaymentView paymentView : paymentViewList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    paymentView.setPaymentStatus(SubscribedCancelled);
                // view 레파지 토리에 save
                paymentViewRepository.save(paymentView);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


//>>> DDD / CQRS
}


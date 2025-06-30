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
public class PublishbookViewViewHandler {

//<<< DDD / CQRS
    @Autowired
    private PublishbookViewRepository publishbookViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBookRegistered_then_CREATE_1 (@Payload BookRegistered bookRegistered) {
        try {

            if (!bookRegistered.validate()) return;

            // view 객체 생성
            PublishbookView publishbookView = new PublishbookView();
            // view 객체에 이벤트의 Value 를 set 함
            publishbookView.setAuthorId(bookRegistered.getAuthorId());
            publishbookView.setTitle(bookRegistered.getTitle());
            publishbookView.setCategory(bookRegistered.getCategory());
            publishbookView.setContent(bookRegistered.getContent());
            publishbookView.setSummary(bookRegistered.getSummary());
            publishbookView.setAudioUrl(bookRegistered.getAudioUrl());
            publishbookView.setImageUrl(bookRegistered.getImageUrl());
            publishbookView.setTodayCount(bookRegistered.getTodayCount());
            publishbookView.setTotalCount(bookRegistered.getTotalCount());
            publishbookView.setAudioUrl(bookRegistered.getAudioUrl());
            publishbookView.setImageUrl(bookRegistered.getImageUrl());
            publishbookView.setTodayCount(bookRegistered.getTodayCount());
            publishbookView.setTotalCount(bookRegistered.getTotalCount());
            // view 레파지 토리에 save
            publishbookViewRepository.save(publishbookView);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (!.validate()) return;
                // view 객체 조회

                List<PublishbookView> publishbookViewList = publishbookViewRepository.findByAuthorId(.getAuthorId());
                for(PublishbookView publishbookView : publishbookViewList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    publishbookView.setPublishbookStatus(BestsellerLabeled);
                // view 레파지 토리에 save
                publishbookViewRepository.save(publishbookView);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


//>>> DDD / CQRS
}


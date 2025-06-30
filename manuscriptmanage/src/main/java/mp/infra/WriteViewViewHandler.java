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
public class WriteViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private WriteViewRepository writeViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenWriteCompleted_then_CREATE_1(
        @Payload WriteCompleted writeCompleted
    ) {
        try {
            if (!writeCompleted.validate()) return;

            // view 객체 생성
            WriteView writeView = new WriteView();
            // view 객체에 이벤트의 Value 를 set 함
            writeView.setAuthorId(writeCompleted.getAuthorId());
            writeView.setTitle(writeCompleted.getTitle());
            writeView.setContent(writeCompleted.getContent());
            writeView.setStatus(writeCompleted.getStatus());
            // view 레파지 토리에 save
            writeViewRepository.save(writeView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenWriteEdited_then_UPDATE_1(
        @Payload WriteEdited writeEdited
    ) {
        try {
            if (!writeEdited.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByAuthorId(
                writeEdited.getAuthorId()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setWriteStatus(WriteEdited);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenWriteDeleted_then_UPDATE_2(
        @Payload WriteDeleted writeDeleted
    ) {
        try {
            if (!writeDeleted.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByAuthorId(
                writeDeleted.getAuthorId()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setWriteStatus(WriteDeleted);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPublishRegistered_then_UPDATE_3(
        @Payload PublishRegistered publishRegistered
    ) {
        try {
            if (!publishRegistered.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByAuthorId(
                publishRegistered.getAuthorId()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setWriteStatus(publishRegistered);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPublishwrited_then_UPDATE_4(
        @Payload Publishwrited publishwrited
    ) {
        try {
            if (!publishwrited.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByLog(
                publishwrited.getLog()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setServiceStatus(publishwrited);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenScriptServiced_then_UPDATE_5(
        @Payload ScriptServiced scriptServiced
    ) {
        try {
            if (!scriptServiced.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByLog(
                scriptServiced.getLog()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setServiceStatus(ScriptServiced);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenImageServiced_then_UPDATE_6(
        @Payload ImageServiced imageServiced
    ) {
        try {
            if (!imageServiced.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByStory(
                imageServiced.getStory()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setServiceStatus(ImageServiced);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenMakeAudiobooked_then_UPDATE_7(
        @Payload MakeAudiobooked makeAudiobooked
    ) {
        try {
            if (!makeAudiobooked.validate()) return;
            // view 객체 조회

            List<WriteView> writeViewList = writeViewRepository.findByStory(
                makeAudiobooked.getStory()
            );
            for (WriteView writeView : writeViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                writeView.setServiceStatus(MakeAudiobooked);
                // view 레파지 토리에 save
                writeViewRepository.save(writeView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}

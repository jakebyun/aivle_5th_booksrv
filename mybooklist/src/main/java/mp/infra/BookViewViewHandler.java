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
public class BookViewViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private BookViewRepository bookViewRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenTxtBought_then_UPDATE_1(@Payload TxtBought txtBought) {
        try {
            if (!txtBought.validate()) return;
            // view 객체 조회

            List<BookView> bookViewList = bookViewRepository.findByUserId(
                txtBought.getUserId()
            );
            for (BookView bookView : bookViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                bookView.setBookStatus(TXTbought);
                // view 레파지 토리에 save
                bookViewRepository.save(bookView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenBookRead_then_UPDATE_2(@Payload BookRead bookRead) {
        try {
            if (!bookRead.validate()) return;
            // view 객체 조회

            List<BookView> bookViewList = bookViewRepository.findByUserId(
                bookRead.getUserId()
            );
            for (BookView bookView : bookViewList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                bookView.setBookStatus(BookOpened);
                // view 레파지 토리에 save
                bookViewRepository.save(bookView);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}

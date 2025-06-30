package mp.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import mp.PaymentApplication;
import mp.domain.PurchaseApproved;
import mp.domain.Subscribed;

@Entity
@Table(name = "Payment_table")
@Data
//<<< DDD / Aggregate Root
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String item;

    private Long amount;

    private String status;

    private Date createdAt;

    @PostPersist
    public void onPostPersist() {
        PurchaseApproved purchaseApproved = new PurchaseApproved(this);
        purchaseApproved.publishAfterCommit();

        Subscribed subscribed = new Subscribed(this);
        subscribed.publishAfterCommit();
    }

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}
//>>> DDD / Aggregate Root

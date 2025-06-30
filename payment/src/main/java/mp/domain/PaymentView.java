package mp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "PaymentView_table")
@Data
public class PaymentView {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String userId;
    private String item;
    private Long amount;
    private String paymentStatus;
    private String status;
    private String createdAt;
}

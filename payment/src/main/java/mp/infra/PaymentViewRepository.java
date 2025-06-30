package mp.infra;

import java.util.List;
import mp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "paymentViews",
    path = "paymentViews"
)
public interface PaymentViewRepository
    extends PagingAndSortingRepository<PaymentView, Long> {
    List<PaymentView> findByUserId(String userId);
}

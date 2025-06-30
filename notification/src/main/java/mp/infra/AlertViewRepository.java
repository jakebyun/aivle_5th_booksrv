package mp.infra;

import java.util.List;
import mp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "alertViews",
    path = "alertViews"
)
public interface AlertViewRepository
    extends PagingAndSortingRepository<AlertView, Long> {
    List<AlertView> findByUserId(String userId);
}

package mp.infra;

import java.util.List;
import mp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "publishbookViews",
    path = "publishbookViews"
)
public interface PublishbookViewRepository
    extends PagingAndSortingRepository<PublishbookView, Long> {
    List<PublishbookView> findByAuthorId(String authorId);
}

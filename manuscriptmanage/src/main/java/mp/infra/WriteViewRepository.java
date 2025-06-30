package mp.infra;

import java.util.List;
import mp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "writeViews",
    path = "writeViews"
)
public interface WriteViewRepository
    extends PagingAndSortingRepository<WriteView, Long> {
    List<WriteView> findByAuthorId(String authorId);
    List<WriteView> findByLog(String log);
    List<WriteView> findByStory(String story);
}

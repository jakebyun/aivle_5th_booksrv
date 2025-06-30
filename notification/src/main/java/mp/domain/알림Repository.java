package mp.domain;

import java.util.Date;
import java.util.List;
import mp.domain.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "알림", path = "알림")
public interface 알림Repository
    extends PagingAndSortingRepository<알림, Long> {}

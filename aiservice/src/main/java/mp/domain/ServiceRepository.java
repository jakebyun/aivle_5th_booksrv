package mp.domain;

import mp.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "services", path = "services")
public interface ServiceRepository
    extends PagingAndSortingRepository<Service, Long> {}

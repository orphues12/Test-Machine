package testmachine.domain;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import testmachine.domain.*;

@RepositoryRestResource(collectionResourceRel = "groups", path = "groups")
public interface GroupRepository
    extends PagingAndSortingRepository<Group, Long> {
    List<Group> findByName(String name);
}

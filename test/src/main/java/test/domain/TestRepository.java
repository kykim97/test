package test.domain;

import test.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="tests", path="tests")
public interface TestRepository extends PagingAndSortingRepository<Test, Long>{

}

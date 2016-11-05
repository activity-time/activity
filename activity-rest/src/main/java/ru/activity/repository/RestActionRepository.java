package ru.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.activity.model.RestAction;

@RepositoryRestResource(path = "actions", collectionResourceRel = "actions")
public interface RestActionRepository extends JpaRepository<RestAction, Long> {

}

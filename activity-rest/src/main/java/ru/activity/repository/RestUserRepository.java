package ru.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.activity.model.RestUser;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface RestUserRepository extends JpaRepository<RestUser, Long> {

}
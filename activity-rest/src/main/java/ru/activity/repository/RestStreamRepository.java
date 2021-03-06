package ru.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.activity.model.Stream;

@RepositoryRestResource(path = "streams", collectionResourceRel = "streams")
public interface RestStreamRepository extends JpaRepository<Stream, Long> {

}
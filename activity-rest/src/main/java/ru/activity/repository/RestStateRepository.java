package ru.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.activity.model.RestStream;

public interface RestStateRepository extends JpaRepository<RestStream, Long> {

}

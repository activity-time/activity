package ru.activity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.activity.model.RestAction;

public interface RestActionRepository extends JpaRepository<RestAction, Long> {

}

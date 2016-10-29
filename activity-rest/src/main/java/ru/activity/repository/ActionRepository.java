package ru.activity.repository;

import org.springframework.data.jpa.repository.Query;
import ru.activity.model.Action;
import ru.activity.model.ActionFilter;
import org.springframework.data.repository.*;

import java.util.List;

public interface ActionRepository extends CrudRepository<Action, Long> {

    //List<Action> findAll(ActionFilter filter);
}

package ru.activity.rest;

import ru.activity.model.Action;
import ru.activity.model.ActionFilter;
import ru.activity.model.ActionState;

import java.util.List;

public interface ActionService {

    long create(Action action);

    void update(Action action);

    Action find(long id);

    List<Action> findAll(ActionFilter filter);

    void setState(ActionState newState);
}

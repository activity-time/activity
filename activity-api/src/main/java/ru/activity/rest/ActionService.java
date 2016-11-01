package ru.activity.rest;

import ru.activity.model.Action;
import ru.activity.model.ActionFilter;

import java.util.List;

public interface ActionService<A extends Action> {

    long create(A action);

    void update(A action);

    A find(long id);

    List<A> findAll(ActionFilter filter);
}

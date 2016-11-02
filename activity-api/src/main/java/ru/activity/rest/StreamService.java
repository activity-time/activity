package ru.activity.rest;

import ru.activity.model.Stream;

import java.util.List;

public interface StreamService<A extends Stream> {

    long create(A action);

    void update(A action);

    A find(long id);

    List<A> findAll();
}

package ru.activity.model;

import java.time.LocalDateTime;
import java.util.Set;

public interface ActionFilter {

    Set<ActionState> getStatuses();

    LocalDateTime getCreatedFrom();

    LocalDateTime getCreatedTo();

    LocalDateTime getRemindFrom();

    LocalDateTime getRemindTo();

    String getSummary();
}

package ru.activity.model;

import java.time.LocalDateTime;
import java.util.Set;

public class ActionFilter {

    private Set<ActionState> statuses;
    private LocalDateTime createdFrom;
    private LocalDateTime createdTo;
    private LocalDateTime remindFrom;
    private LocalDateTime remindTo;
    private String summary;
}

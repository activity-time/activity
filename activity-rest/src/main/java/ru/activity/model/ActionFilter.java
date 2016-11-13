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

    public Set<ActionState> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<ActionState> statuses) {
        this.statuses = statuses;
    }

    public LocalDateTime getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(LocalDateTime createdFrom) {
        this.createdFrom = createdFrom;
    }

    public LocalDateTime getCreatedTo() {
        return createdTo;
    }

    public void setCreatedTo(LocalDateTime createdTo) {
        this.createdTo = createdTo;
    }

    public LocalDateTime getRemindFrom() {
        return remindFrom;
    }

    public void setRemindFrom(LocalDateTime remindFrom) {
        this.remindFrom = remindFrom;
    }

    public LocalDateTime getRemindTo() {
        return remindTo;
    }

    public void setRemindTo(LocalDateTime remindTo) {
        this.remindTo = remindTo;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

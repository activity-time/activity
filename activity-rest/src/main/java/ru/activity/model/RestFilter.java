package ru.activity.model;

import java.time.LocalDateTime;
import java.util.Set;

public class RestFilter implements ActionFilter {

    private Set<ActionState> statuses;
    private LocalDateTime createdFrom;
    private LocalDateTime createdTo;
    private LocalDateTime remindFrom;
    private LocalDateTime remindTo;
    private String summary;

    @Override
    public Set<ActionState> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<ActionState> statuses) {
        this.statuses = statuses;
    }

    @Override
    public LocalDateTime getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(LocalDateTime createdFrom) {
        this.createdFrom = createdFrom;
    }

    @Override
    public LocalDateTime getCreatedTo() {
        return createdTo;
    }

    public void setCreatedTo(LocalDateTime createdTo) {
        this.createdTo = createdTo;
    }

    @Override
    public LocalDateTime getRemindFrom() {
        return remindFrom;
    }

    public void setRemindFrom(LocalDateTime remindFrom) {
        this.remindFrom = remindFrom;
    }

    @Override
    public LocalDateTime getRemindTo() {
        return remindTo;
    }

    public void setRemindTo(LocalDateTime remindTo) {
        this.remindTo = remindTo;
    }

    @Override
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}

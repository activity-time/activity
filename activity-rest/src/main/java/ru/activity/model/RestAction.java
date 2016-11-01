package ru.activity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class RestAction implements Action {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String summary;
//    private LocalDateTime creationDate = LocalDateTime.now();
//    private LocalDateTime remindDate;
    private String memo;
    private String who;
    private ActionState state;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getSummary() {
        return summary;
    }

    @Override
    public void setSummary(String summary) {
        this.summary = summary;
    }

//    @Override
//    public LocalDateTime getCreationDate() {
//        return creationDate;
//    }

//    public void setCreationDate(LocalDateTime creationDate) {
//        this.creationDate = creationDate;
//    }

//    @Override
//    public LocalDateTime getRemindDate() {
//        return remindDate;
//    }

//    @Override
//    public void setRemindDate(LocalDateTime remindDate) {
//        this.remindDate = remindDate;
//    }

    @Override
    public String getMemo() {
        return memo;
    }

    @Override
    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String getWho() {
        return who;
    }

    @Override
    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public ActionState getState() {
        return state;
    }

    @Override
    public void setState(ActionState state) {
        this.state = state;
    }
}

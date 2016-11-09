package ru.activity.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "action")
public class RestAction implements Action {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private RestStream stream;
    private String summary;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime creationDate = LocalDateTime.now();

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime remindDate = LocalDateTime.now();

    private String memo;
    private String who;
    private ActionState state;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RestStream getStream() {
        return stream;
    }

    public void setStream(RestStream stream) {
        this.stream = stream;
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(LocalDateTime remindDate) {
        this.remindDate = remindDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestAction that = (RestAction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(stream, that.stream) &&
                Objects.equals(summary, that.summary) &&
                state == that.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stream, summary, state);
    }
}

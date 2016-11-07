package ru.activity.model;

public interface Action {
    
    Long getId();
    
    String getSummary();
    void setSummary(String summary);
    
//    LocalDateTime getCreationDate();
    
//    LocalDateTime getRemindDate();
//    void setRemindDate(LocalDateTime remindDate);

    String getMemo();
    void setMemo(String memo);

    String getWho();
    void setWho(String who);

    ActionState getState();
    void setState(ActionState state);
}

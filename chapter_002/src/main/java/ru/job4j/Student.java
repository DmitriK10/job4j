package ru.job4j;

import java.util.Date;

public class Student {
    private String sFIO;
    private String groupID;
    private Date enter;

    public String getsFIO() {
        return sFIO;
    }

    public void setsFIO(String sFIO) {
        this.sFIO = sFIO;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public Date getEnter() {
        return enter;
    }

    public void setEnter(Date enter) {
        this.enter = enter;
    }
}
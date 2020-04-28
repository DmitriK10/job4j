package ru.job4j.tracker;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education; }

    public Date getbirthday() {
        return birthday;
    }

    public Profession() {
    }

    public static void main(String[] args) {
        Profession profession = new Profession();
    }

}


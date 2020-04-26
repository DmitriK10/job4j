package ru.job4j.tracker;

import java.util.Date;

public class Profession {
    String name;
    String surname;
    String education;
    Date birthday;

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


package ru.job4j;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setsFIO("Ivanov Ivan Ivanovitch");
        student.setGroupID("M01");
        student.setEnter(new Date());

        System.out.println(student.getsFIO() + " has entered  - " + student.getGroupID() + " : " + student.getEnter());
    }
}
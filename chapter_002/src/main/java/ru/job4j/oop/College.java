package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объекта класса Freshman. */
        Freshman freshman = new Freshman();

        /* делаем приведение к типу родителя Transport. */
        Student tp = freshman;
        /* делаем приведение к типу родителя Object. */
        Object obj = freshman;

        /* Приведение типа при создании объекта. */
        Object ofreshman = new Freshman();
        /* Приведение типа за счет понижения по иерархии.  */
        Freshman freshmanFromObject = (Freshman) ofreshman;

        // Down casting
        Student studentDC = new Freshman();
        ((Freshman) studentDC).toString();

        // Upcasting
        Student student = freshman;
        student = (Student) freshman;

        System.out.println("upcasting    Student student = freshman; student = (Student) freshman;             : " + student.toString());
        System.out.println("downcasting  Student studentDC = new Freshman(); ((Freshman) studentDC).toString();: " + ((Freshman) studentDC).toString());
    }
}

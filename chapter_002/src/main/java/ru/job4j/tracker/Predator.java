package ru.job4j.tracker;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String name) {
        super();
        System.out.println("Class Predator " + name);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator1 = new Predator("Dog");
    }
}

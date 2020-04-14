package ru.job4j.tracker;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String name2) {
        super(name2);
        System.out.println("Class Predator croak " + name2);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator1 = new Predator("Wu-wu");
    }
}

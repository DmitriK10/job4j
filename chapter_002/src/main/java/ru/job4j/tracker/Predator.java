package ru.job4j.tracker;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public static void main(String[] args) {
        Predator tiger = new Tiger();
    }
}
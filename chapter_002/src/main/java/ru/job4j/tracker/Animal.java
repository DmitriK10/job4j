package ru.job4j.tracker;

public class Animal {

    private String name;

    public Animal() {
        System.out.println("Class Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Class Animal name " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}

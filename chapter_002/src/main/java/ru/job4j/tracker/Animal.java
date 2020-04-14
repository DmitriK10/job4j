package ru.job4j.tracker;

public class Animal {

    private String name, name2, name3;

    public Animal() {
        System.out.println("Class Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Class Animal name " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal("Dog");
    }
}

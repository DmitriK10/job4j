package ru.job4j.tracker;

public class Animal {

    String name = "Dog";

    public Animal() {
        System.out.println("Class Animal");
    }

    public Animal(String name) {
        name = this.name;
        System.out.println("Class Animal name " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal("Dog");
    }
}

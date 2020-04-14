package ru.job4j.tracker;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Class Tiger");
    }

    public Tiger(String name3) {
        super(name3);
        System.out.println("Class Tiger roar " + name3);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger("R-r-r");
    }
}

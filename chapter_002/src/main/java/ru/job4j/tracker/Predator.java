package ru.job4j.tracker;

/**
 * Класс Predator.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 25.04.20
 */
public class Predator extends Animal {
    public Predator() {
        super();
        System.out.println("Class Predator");
    }


    public Predator(String name) {
        super(name);
        System.out.println("Class Predator hoot " + name);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator1 = new Predator("Whoo-whoo!");
    }
}

/*
public class Predator extends Animal {
    String name2;

    public Predator() {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String name) {
        super();
        System.out.println("Class Predator");
    }

    public Predator(String name, String name2) {
        super(name);
        this.name2 = name2;
        System.out.println("Class Predator hoot " + name2);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator1 = new Predator("", "Whoo-whoo!");
    }
}
*/

package ru.job4j.tracker;

/**
 * Класс Tiger.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 25.04.20
 */
public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Class Tiger");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Class Tiger roar " + name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Tiger tiger2 = new Tiger("R-r-r");
    }
}

/*
package ru.job4j.tracker;


/**
 * Класс Tiger.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 18.04.20
 *//*

public class Tiger extends Predator {
    String name3;

    public Tiger() {
        super();
        System.out.println("Class Tiger");
    }

    public Tiger(String name, String name2, String name3) {
        super(name, name2);
        this.name3 = name3;
        System.out.println("Class Tiger roar " + name3);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Tiger tiger2 = new Tiger("", "Woo-woo","R-r-r");
    }
}*/

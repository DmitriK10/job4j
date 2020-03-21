package ru.job4j.oop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 09.03.19 */
public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);

    }
}

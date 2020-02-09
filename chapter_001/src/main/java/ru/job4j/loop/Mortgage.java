package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 10.07.19
 */
public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount -  salary + (amount * percent / 100);
            year++;
        }
        return year;
    }
}
package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 10.07.19
 */
public class Mortgage {
    public int year(double amount, int monthly, double percent) {
        int year = 0,x = 1;
        while (amount > 0) {
            while ((x <= 12) && (amount>0)) {
                amount = amount -  monthly + amount % percent / 12;
                x++;
            }
            year++;
        }
        return year;
    }
}
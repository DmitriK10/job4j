package ru.job4j.loop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 21.03.18
 */
public class Factorial {
    public int calc(int n) {
        int rsl = 1;
        for (int i = 1; i <= n; i++) {
            rsl = rsl * i;
        }
        return rsl;
    }
}

package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 07.07.19
 */
public class PrimeNumber {
    /**
     * посчитать количество простых чисел от 1 до finish.
     */
    public int calc(int finish) {
        int count = 0;
        int a = 0;
        for (int x = 1; x <= finish; x++) {
            for (int y = 1; y <= x; y++) {
                if (x % y == 0) {
                    a++;
                }

            }
            if (a == 2) {
                count++;
            }
            a = 0;
        }
        return count;
    }
}

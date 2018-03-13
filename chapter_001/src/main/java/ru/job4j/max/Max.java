package ru.job4j.max;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 13.03.18
 */

public class Max {

    /**
     * Ищем большее из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return Евро.
     */
    public int max(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}

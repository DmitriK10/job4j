package ru.job4j.condition;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 15.03.20
 * ООП вариант
 */
public class Max {
    /**
     * Ищем большее из двух чисел.
     * @param first  первое число.
     * @param second второе число.
     * @return Максимум.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(temp, third);
    }
    public int max(int first, int second, int third, int forth) {
        int temp = max(first, second);
        temp = max(temp, third);
        return max(temp, forth);
    }
}

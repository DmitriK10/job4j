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
     * @return Максимум.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }


 /**
  * Ищем большее из трех чисел.
  * @param first первое число.
  * @param second второе число.
  * @param third третье число.
  * @return temp.
  */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}

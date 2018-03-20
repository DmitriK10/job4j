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

    public int max(int first, int second) {
        /*
        if (first > second) {
            return first;
        } else {
            return second;
        } */
       /*
        return first > second ? first : second;
    }
    */

 /**
  * Ищем большее из трех чисел.
  * @param first первое число.
  * @param second второе число.
  * @param third третье число.
  * @return temp.
  */
    public int max(int first, int second, int third) {
        //int temp = Math.max(first, second);
        //temp = Math.max(temp, third);
        //int temp = Math.max(first, Math.max(second, third));
        //return temp;
        return Math.max(first, Math.max(second, third));
    }
}

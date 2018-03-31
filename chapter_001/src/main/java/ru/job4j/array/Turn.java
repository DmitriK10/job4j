package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 31.03.18
 */

public class Turn {

    /**
     * Реализовать переворот значений задом наперёд в массиве.
     * @param array массив чисел.
     * @return array перевёрнутый массив.
     */

    public int[] turn(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int tempData = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = tempData;
        }
        return array;
    }
}
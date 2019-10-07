package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 30.03.18
 */
public class FindLoop {
    /**
     * Реализовать поиск значения в дипазоне в массиве.
     * @param data массив чисел.
     * @param el число поиска.
     * @return rst результат поиска.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int aData : data) {
            if (aData == el) {
                rst = el;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int aData = start; aData <= finish; aData ++) {
            if (data[aData] == el) {
                rst = aData;
                break;
            }
        }
        return rst;
    }
}
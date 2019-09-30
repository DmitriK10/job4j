/*
package ru.job4j.array;

*/
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 30.03.18
 *//*

public class FindLoop {
    */
/**
     * Реализовать поиск значения в массиве.
     * @param data массив чисел.
     * @param el число поиска.
     * @return rst результат поиска.
     *//*

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

    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int aData : data) {
            if (aData == el) {
                rst = el;
                break;
            }
        }
        return rst;
    }

    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int minId = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minId = j;
                }
            }
            // замена
            int temp = data[i];
            data[i] = min;
            data[minId] = temp;
        }
        return data;
    }
}*/

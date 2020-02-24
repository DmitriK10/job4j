package ru.job4j.array;
/**
 * 6.5.3. Сортировка выборкой.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 23.12.19
 */
public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int tmp = data[i];
            data[i] = data[index];
            data[index] = data[i];
        }
        return data;
    }
}
package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 02.04.18
 */
public class BubbleSort {
    /**
     * Реализовать сортировку значений по возрастанию в массиве.
     * @param array массив чисел.
     * @return array отсортированный массив.
     */
    public int[] bubblesort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
}
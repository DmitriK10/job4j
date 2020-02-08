package ru.job4j.array;
/**
 * Поиск минимума в диапазоне.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 20.12.2019
 */
public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = start;
        int tmp;
        for (int i = start; i < finish; i++) {
            if (array[i] < array[min]) {
                tmp = array[min];
                array[min] = array[i];
                array[i] = tmp;
            }
        }
        return array[min];
    }
}
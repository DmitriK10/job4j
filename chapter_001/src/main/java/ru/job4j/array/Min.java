package ru.job4j.array;
/**
 * Поиск минимума.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 10.12.2019
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
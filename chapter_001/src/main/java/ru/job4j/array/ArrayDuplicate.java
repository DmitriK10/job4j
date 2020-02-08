package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 10.04.18
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int tmp = 1;
        for (int i = 0; i < array.length - tmp; i++) {
            for (int y = i + 1; y < array.length - tmp; y++){
                if (array[i].equals(array[y])) {
                    String tempStr = array[array.length - tmp];
                    array[array.length - tmp] = array[y];
                    array[y] = tempStr;
                    tmp++;
                }
            }
        }
        return  Arrays.copyOf(array,array.length - tmp + 1));
    }
}

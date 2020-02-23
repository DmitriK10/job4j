package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 03.04.18
 */
public class Matrix {
    /**
     * Реализовать таблицу умножения.
     * @param size размер таблицы.
     * @return array умноженный массив.
     */
    public int[][] multiple(int size) {
        int[][] array  = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}


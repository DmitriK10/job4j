package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 11.07.18
 */

public class Check {
    /**
     * Проверяем одинаковыми или нет значениями заполнен массив.
     * @param data массив данных.
     * @return true если массив заполнен одинаковыми значениями
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1] ) {
                result = false;
                break;
            }
        }
        return result;
    }
}
package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 30.03.18
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 1; i <= bound; i++) {
            rst[i-1] = i * i;
        }
        return rst;
    }
}


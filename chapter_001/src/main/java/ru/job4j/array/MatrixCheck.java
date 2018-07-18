package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 18.07.18
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        Boolean  symb = data[0][0];
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < data.length; i++) {
            toright &= (data[i][i] == symb);
            toleft &= (data[data.length-i-1][i] == symb);
        }

        return toright || toleft;
    }
}
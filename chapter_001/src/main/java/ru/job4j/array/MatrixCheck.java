package ru.job4j.array;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 18.07.18
 */

public class MatrixCheck {
    /**
     * Необходимо проверить, что все элементы по диагоналям равны true или false.
     * @param data массив true или false.
     * @return  результат проверки.
     */

    public boolean mono(boolean[][] data) {
        Boolean  symbLeftDiag = data[0][0];
        Boolean  symbRightDiag = data[data.length-1][0];
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < data.length; i++) {
            toright = toright & (data[i][i] == symbLeftDiag);
            toleft &= (data[data.length-i-1][i] == symbRightDiag);
        }

        return toright & toleft;
    }
}
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
        Boolean  symbRightDiag = data[data.length - 1][0];
        boolean res = true;

        for (int i = 0; i < data.length; i++) {
            if ((symbLeftDiag != data[i][i]) || (symbRightDiag != data[data.length - i - 1][i])) {
                res = false;
                break;
            }
        }

        return res;
    }
}
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
        Boolean diagonal1 = data[0][0];
        Boolean diagonal2 = data[data.length - 1][0];
        boolean res = true;
        for (int i = 0; i < data.length; i++) {
            if ((diagonal1 != data[i][i]) || (diagonal2 != data[data.length - i - 1][i])) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for ( int i = 0; i < board[0].length; i++ ) {
            if ( board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
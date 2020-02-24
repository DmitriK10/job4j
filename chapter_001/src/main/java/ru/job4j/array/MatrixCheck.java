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
    /*6.7.1. Моно строка в матрице. [#214126]
     * нужно будет проверить, что строка в двухмерном массива целиком заполнена символом 'X'.
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[0].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    /*6.7.2. Моно столбец в матрице. [#214127]
     * нужно сделать аналогичный метод, который будет проверять, что все элементы в колонки заполнены символом 'X'.
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
    //6.7.4. Выигрышные комбинации в сокобан [#53859]
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int num = 0;
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 5; y++) {
                if (board[y][i] == 'X') {
                   num++;
                }
            }
            if (num == 5) {
                result = true;
            }
            num = 0;
        }
        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 5; y++) {
                if (board[i][y] == 'X') {
                    num++;
                }
            }
            if (num == 5) {
                result = true;
            }
            num = 0;
        }
        return result;
    }
}
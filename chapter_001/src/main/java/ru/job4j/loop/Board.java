package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 26.03.18
 */

public class Board {
    /**
     * Строим шахматную доску символом Х по заданным: ширине и высоте
     * @param width ширина игрового поля.
     * @param height высота игрового поля.
     * @return screen игровое поле в формате строки.
     */
    public static String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        String str = "Привет";
        int nest = 0;
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0)  {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
                nest++;
            }
            screen.append(ln);
        }
        return screen.toString();
    }

}

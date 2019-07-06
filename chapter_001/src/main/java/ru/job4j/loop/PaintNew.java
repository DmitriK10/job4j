package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 10.06.2019
 */
public class PaintNew {
    public String rightTrl(int h) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int height = 0; height != h; height++) {
            for (int width = 0; width != h*2-1; width++) {
                if (height >= h- width - 1 && width <= height + h - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        //int width = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != height; column++) {
                if (row >= height- column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width= 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
package ru.job4j.tictactoe;
import javafx.scene.shape.Rectangle;

import java.awt.*;

/**
 * Класс TicTacToe - реализует визуальный компонент.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 23.07.18
 */
public class Figure3T extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;
    public Figure3T() {
    }
    public Figure3T(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }
    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }
    public boolean hasMarkX() {
        return this.markX;
    }
    public boolean hasMarkO() {
        return this.markO;
    }
}


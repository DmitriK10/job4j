package ru.job4j.tictactoe;

/**
 * Класс Logic3T - проверка логики.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 23.07.18
 */

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        for (Figure3T[] aTable : table) {
            int NumX = 0;
            for (int j = 0; j < table.length; j++) {
                if (aTable[j].hasMarkX()) {
                    NumX++;
                    if (NumX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < table.length; j++) {
            int NumX = 0;
            for (Figure3T[] aTable : table) {
                if (aTable[j].hasMarkX()) {
                    NumX++;
                    if (NumX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        int NumX = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i].hasMarkX()) {
                NumX++;
                if (NumX == 3) {
                    result = true;
                    break;
                }
            }
        }
        NumX = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[table.length-i-1][i].hasMarkX()) {
                NumX++;
                if (NumX == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        for (Figure3T[] aTable : table) {
            int NumX = 0;
            for (int j = 0; j < table.length; j++) {
                if (aTable[j].hasMarkO()) {
                    NumX++;
                    if (NumX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }

        for (int j = 0; j < table.length; j++) {
            int NumX = 0;
            for (Figure3T[] aTable : table) {
                if (aTable[j].hasMarkO()) {
                    NumX++;
                    if (NumX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            int NumX = 0;
            if (table[i][i].hasMarkO()) {
                NumX++;
                if (NumX == 3) {
                    result = true;
                    break;
                }
            }
        }
        int NumX = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i].hasMarkO()) {
                NumX++;
                if (NumX == 3) {
                    result = true;
                    break;
                }
            }
        }
        NumX = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[table.length-i-1][i].hasMarkO()) {
                NumX++;
                if (NumX == 3) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (Figure3T[] aTable : table) {
            for (int j = 0; j < table.length; j++) {
                if (!aTable[j].hasMarkX() & !aTable[j].hasMarkO()) {
                    result = true;
                }
            }
        }
        return result;
    }
}
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
        // проверка выигрышной комбинации для крестиков на горизонталям игрового поля
        for (Figure3T[] aTable : table) {
            int numX = 0;
            for (int j = 0; j < table.length; j++) {
                if (aTable[j].hasMarkX()) {
                    numX++;
                    if (numX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        // проверка выигрышной комбинации для крестиков по вертикалям игрового поля
        for (int j = 0; j < table.length; j++) {
            int numX = 0;
            for (Figure3T[] aTable : table) {
                if (aTable[j].hasMarkX()) {
                    numX++;
                    if (numX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        // проверка выигрышной комбинации для крестиков диагоналях игрового поля
        int numX = 0;
        for (int i = 0; i < table.length; i++) {
            if ((table[i][i].hasMarkX()) || (table[table.length - i - 1][i].hasMarkX())) {
                numX++;
                if (numX == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    public boolean isWinnerO() {
        // проверка выигрышной комбинации для ноликов на горизонталям игрового поля
        boolean result = false;
        for (Figure3T[] aTable : table) {
            int numX = 0;
            for (int j = 0; j < table.length; j++) {
                if (aTable[j].hasMarkO()) {
                    numX++;
                    if (numX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        // проверка выигрышной комбинации для ноликов вертикалям
        for (int j = 0; j < table.length; j++) {
            int numX = 0;
            for (Figure3T[] aTable : table) {
                if (aTable[j].hasMarkO()) {
                    numX++;
                    if (numX == 3) {
                        result = true;
                        break;
                    }
                }
            }
        }
        // проверка выигрышной комбинации для ноликов на диагоналях игрового поля
        int numX = 0;
        for (int i = 0; i < table.length; i++) {
            if ((table[i][i].hasMarkO()) || (table[table.length - i - 1][i].hasMarkO()))  {
                numX++;
                if (numX == 3) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    public boolean hasGap() {
        // проверка наличия пустых клеток для нового хода
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

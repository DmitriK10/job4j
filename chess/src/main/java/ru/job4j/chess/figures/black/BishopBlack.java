package ru.job4j.chess.figures.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/**
 * 2. Каркас шахматной доски [#792]
 * @version $Id$
 * @since 23.05.2021
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    //построение пути фигуры
    public Cell[] way(Cell dest) {

        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
                    String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int posX = position().getX();
        int posY = position().getY();
        int size = Math.abs(posX - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = posX < dest.getX() ? 1 : -1;
        int deltaY = posY < dest.getY() ? 1 : -1;
        for (int index = 0; index < size; index++) {
            posX += deltaX;
            posY += deltaY;
            steps[index] = Cell.findBy(posX, posY);
        }
        return steps;
    }

    //проверка пути фигуры соответствия на диагональ
    public boolean isDiagonal(Cell source, Cell dest) {
        return Math.abs(source.getX() - dest.getX()) == Math.abs(source.getY() - dest.getY());
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}

package ru.job4j.chess.figures.black;

import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.Figure;

/*
 * 2. Каркас шахматной доски [#792]
 * @since 24.05.2021
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
            throw new IllegalStateException(
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
            int x = posX + deltaX * (index + 1);
            int y = posY + deltaY * (index + 1);
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    //проверка пути фигуры соответствия на диагональ
    public boolean isDiagonal(Cell source, Cell dest) {
        boolean fl = false;
        if (Math.abs(source.getX() - dest.getX()) == Math.abs(source.getY() - dest.getY())) {
            fl = true;
        } else {
            fl = false;
        }
        return fl;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}

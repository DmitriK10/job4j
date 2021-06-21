package ru.job4j.chess.figures.black;


import org.junit.Test;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.FigureNotFoundException;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.figures.Cell;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test (expected = ImpossibleMoveException.class)
    public void impossibleMoveException()
            throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = {Cell.D2, Cell.E3};
        bishopBlack.way(Cell.E1);
        bishopBlack.way(Cell.E5);
    }

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        assertThat(bishopBlack.position(), is(Cell.F8));

    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        assertThat(bishopBlack.copy(Cell.F1).position(), is(Cell.F1));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(rsl));
    }

    @Test
    public void way2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell[] rsl = {Cell.E7, Cell.D6, Cell.C5, Cell.B4, Cell.A3};
        assertThat(bishopBlack.way(Cell.A3), is(rsl));
    }
}
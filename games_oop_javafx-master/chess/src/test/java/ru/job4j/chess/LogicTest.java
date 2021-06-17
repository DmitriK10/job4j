package ru.job4j.chess;

import javafx.scene.Group;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.figures.Cell;
import ru.job4j.chess.figures.black.BishopBlack;

/*
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
*/

public class LogicTest {

    @Test (expected = FigureNotFoundException.class)
    public void figureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.D8, Cell.E7);
    }

    @Test (expected = OccupiedCellException.class)
    public void occupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.add(new BishopBlack(Cell.D6));
        logic.move(Cell.F8, Cell.C5);
    }


/*    @Test (expected = ImpossibleMoveException.class)
    public void impossibleMoveException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F8));
        logic.move(Cell.F8, Cell.E7);
    }*/
}
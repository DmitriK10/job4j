
package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointTest {
    @Test
    public void whenZeroAndThenTen() {
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        double result = a.distance3d(b);
        double expected = 5.0;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenZeroAndThenTwo() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 5, 0);
        double result = a.distance3d(b);
        double expected = 5.0;
        Assert.assertEquals(expected, result, 0.01);
    }
}




package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointTest {
    @Test
    public void whenZeroAndThenTen() {
        Point point = new Point();
        Point a = new point(0, -3, 3);
        Point b = new point(3, 1, 3);
        Point res;
        double result = point.distance3d(res);
        assertThat(result, is(5));
    }
}



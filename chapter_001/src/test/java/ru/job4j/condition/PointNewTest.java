package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointNewTest {
    @Test
    public void whenZeroAndTenThenTen() {
        PointNew point = new PointNew();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}

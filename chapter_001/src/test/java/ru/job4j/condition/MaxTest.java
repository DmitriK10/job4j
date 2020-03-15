
package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 0);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To4Then1() {
        Max max = new Max();
        int result = max.max(10, 2, 0, 4);
        assertThat(result, is(10));
    }
}
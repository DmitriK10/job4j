package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class MaxTest.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 20.03.2018
 */

public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max max = new Max();
        int result = max.max(1,  2,  3);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondLessFirst() {
        Max max = new Max();
        int result = max.max(4, 2,  1);
        assertThat(result, is(1));
    }
}
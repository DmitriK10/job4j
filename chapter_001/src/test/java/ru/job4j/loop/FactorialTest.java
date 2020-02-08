package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class CounterTest.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 21.03.2018
 */

public class FactorialTest {
    @Test
    public void whenFactorialFromOneToFileThenOneHundredTYwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenFactorialFromOneToZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Class ArrayDuplicateTest.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 10.04.2018
 */

public class ArrayDublicateTest {

    @Test
    public void whenIsDublicate() {
        ArrayDuplicate arrayduplicate = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayduplicate.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNoDublicate() {
        ArrayDuplicate arrayduplicate = new ArrayDuplicate();
        String[] input = new String[] {"Привет", "Мир", "Весна", "Труд", "Мир"};
        String[] result = arrayduplicate.remove(input);
        String[] expect = new String[] {"Привет", "Мир", "Весна", "Труд", "Мир"};
        assertThat(result, is(expect));
    }
}


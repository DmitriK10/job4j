package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * 2. Отсортировать департаменты [#34352]
 */
public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange2() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k1/sk1/skk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/skk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenBigChanges() {
        List<String> input = List.of(
                "K2/SK1/SSK2", "K1/SK1/SSK2", "K1", "K1/SK1", "K2/SK1/SSK1", "K1/SK1/SSK1",
                "K1/SK2", "K2/SK1", "K2");
        List<String> expect = List.of(
                "K1/SK1", "K1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2", "K2/SK1",
                "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }
}
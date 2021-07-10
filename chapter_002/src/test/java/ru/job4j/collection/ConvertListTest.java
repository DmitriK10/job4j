package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

//5. Конвертация листа массивов в один лист Integer [#10037]
public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }

    @Test
    public void whenFiveList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {9, 4, 100});
        in.add(new int[] {0, 111, 0});
        in.add(new int[] {100});
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(9, 4, 100, 0, 111, 0, 100, 1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Objects;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

//0. Сортировка [#10096]
public class ComparatorTest {

    @Test
    public void sortUp() {
        List<Item> items = Arrays.asList(new  Item( "item1"), new Item( "item4"), new Item( "item3"), new Item( "item2"));
        Collections.sort(items, new CompSortUp());
        assertThat(items.get(3).getName(), is("item4"));
    }

    @Test
    public void sortDown() {
        List<Item> items = Arrays.asList(new  Item( "item1"), new Item( "item2"), new Item( "item3"), new Item( "item4"));
        Collections.sort(items, new CompSortDown());
        assertThat(items.get(3).getName(), is("item1"));
    }

    @Test
    public void sortUp2() {
        List<Item> items = Arrays.asList(new  Item( "item1"), new Item( "item4"), new Item( "item3"), new Item( "item2"));
        Collections.sort(items, new CompSortUp());
        List<Item> items1 = Arrays.asList(new  Item( "item1"), new Item( "item2"), new Item( "item3"), new Item( "item4"));
        assertThat(items, is(items1));
    }

    @Test
    public void sortDown2() {
        List<Item> items = Arrays.asList(new  Item( "item1"), new Item( "item4"), new Item( "item3"), new Item( "item2"));
        Collections.sort(items, new CompSortDown());
        List<Item> items1 = Arrays.asList(new  Item( "item4"), new Item( "item3"), new Item( "item2"), new Item( "item1"));
        assertThat(items, is(items1));
    }
}

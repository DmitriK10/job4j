package ru.job4j.tracker;

import java.util.Comparator;

//0. Сортировка [#10096]
public class CompSortUp implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        return item1.getName().compareTo(item2.getName());
    }
}

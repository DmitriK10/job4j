package ru.job4j.collection;

import java.util.Comparator;

/**
 * 2. Отсортировать департаменты [#34352]
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        int result = right[0].compareTo(left[0]);
        if (result != 0) {
            return result;
        } else {
            return o1.compareTo(o2);
        }
    }
}

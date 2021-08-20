package ru.job4j.collection;
//4. Сортировка номера [#221284]

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int a = Integer.parseInt(left.split(". ")[0]);
        int b = Integer.parseInt(right.split(". ")[0]);
        return Integer.compare(a, b);
    }
}
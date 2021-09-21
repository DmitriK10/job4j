package ru.job4j.collection;

import java.util.*;

/**
 * 2. Отсортировать департаменты [#34352]
 * клмпаратор
 */
public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Boolean fl = true;
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(value);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {

        orgs.sort(new DepDescComp());
    }
}
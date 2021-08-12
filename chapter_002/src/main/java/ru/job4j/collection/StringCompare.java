package ru.job4j.collection;
//3. Компаратор для строк [#35008]

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int index =0; index < Math.min(left.length(), right.length()); index++) {
            if (left.charAt(index) != right.charAt(index)) {
                return Character.compare(left.charAt(index), right.charAt(index));
            }        }
        if (left.length() == right.length()) {
            return 0;
        } else {
            return Math.min(left.length(), right.length()) - Math.max(left.length(), right.length());
        }
    }
}
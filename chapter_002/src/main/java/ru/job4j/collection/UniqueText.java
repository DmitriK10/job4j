package ru.job4j.collection;
// 2. Идентичные тексты [#212655]

import java.util.HashSet;

public class UniqueText {
    @SuppressWarnings("checkstyle:EmptyStatement")
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String orig : origin) {
            check.add(orig);
        }
        for (String txt : text) {
            if (!check.contains(txt)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
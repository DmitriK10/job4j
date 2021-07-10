package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

//5. Конвертация листа массивов в один лист Integer [#10037]
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] numArray:list) {
            for (int i : numArray) {
                rsl.add(i);
            }
        }
        return rsl;
    }
}
package ru.job4j.collection;
//0. Map, HashMap [#212652]

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        //map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("Ivan@yandex.ru", "Ivan Sidoroff");
        map.put("Nikolay@yandex.ru", "Nikolay Ivanov");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
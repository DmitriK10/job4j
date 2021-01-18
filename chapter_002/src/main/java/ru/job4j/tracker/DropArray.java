package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor", null};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
    /*
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];
        int size1 = 0;
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (name != null) {
                namesWithoutNull[size1] = name;
                size1++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size1);
        *//*for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }*//*


    }*/
}
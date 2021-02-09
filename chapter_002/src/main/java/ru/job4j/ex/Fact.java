package ru.job4j.ex;
//0.2. Кидаем исключение - throw new RuntimeException [#219365]

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Start should be less then finish.");
        } else {
            int rsl = 1;
            for (int index = 1; index <= n; index++) {
                rsl *= index;
            }
            return rsl;
        }
    }
}
package ru.job4j.tracker.other;

public class AnagramChecker {

    public static void main(String[] args) {
        Boolean res = false;
        String first = " te s q", second = "etst ";
        String a = first.replaceAll(" ", "");
        String b = second.replaceAll(" ", "");
        if (a.length() != b.length()) {
            System.out.println(res);
        }
        for (int i = 0; i <= a.length(); i++) {
            for (int y = i; y <= b.length(); y++) {
                if (a.charAt(i) == b.indexOf(y)) {
                    System.out.println(res);
                }
            }
        }
        System.out.println(res);
    }
}
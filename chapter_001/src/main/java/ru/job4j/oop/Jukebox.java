package ru.job4j.oop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 07.03.19 */
public class Jukebox {
    public void music(int position) {
        Student petya = new Student();
        String lyrics;
        if (position == 1) {
            lyrics = "Пусть бегут неуклюже";
        } else if (position == 2) {
            lyrics = "Спокойной ночи";
        } else {
            lyrics = "Песня не найдена";
        }
           System.out.println("I can sign a song : " + lyrics);
    }
    public static void main(String[] args) {
        Jukebox juke1 = new Jukebox();
        juke1.music(1);
        juke1.music(2);
        juke1.music(0);
    }
}
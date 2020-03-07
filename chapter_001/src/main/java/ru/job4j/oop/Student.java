package ru.job4j.oop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 07.03.19 */
public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }
    public void song() {
        System.out.println("I believe I can fly");
    }
    public void play() {
        System.out.println("playing bayan");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
        petya.play();
        petya.play();
        petya.play();
    }
}
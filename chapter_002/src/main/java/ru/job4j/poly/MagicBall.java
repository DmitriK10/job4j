package ru.job4j.poly;

import java.util.Scanner;
import java.util.Random;

// 1. Чтение из консоли. Класс Scanner. [#179514]
public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? Задайте вопрос, на который можно ответить либо да, либо нет.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        switch (answer) {
            case 0: System.out.println("Да");
                break;
            case 1: System.out.println("Нет");
                break;
            default: System.out.println("Может быть!");
        }
    }
}
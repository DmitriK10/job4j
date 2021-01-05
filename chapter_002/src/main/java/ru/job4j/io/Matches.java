package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

//1. Чтение из консоли. Класс Scanner. [#179514]
public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int run = 0;
        while ((run != 1) | (run != 2) | (run != 3)) {
            System.out.println("Игра 'Спички';.");
            System.out.println("1. 1 игрок");
            System.out.println("2. 2 игрока");
            System.out.println("3. Выйти");
            System.out.println("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
                System.out.println("Игра завершена.");
                run = 3;
                break;
            } else if (select == 1) {
                System.out.println("'Спички' для 1 игрока загружаются ... ");
                mGame(1);
            } else if (select == 2) {
                System.out.println("'Спички' для 2 игроков  загружается ... ");
                mGame(2);
            } else {
                System.out.println("Введено некорректное число!");
            }
            System.out.println();
        }
        switch (run) {
            case    1: mGame(1);
            case    2: mGame(2);
        }
    }

    public static void mGame(int num) {
        boolean soloplay;
        switch (num) {
            case 1: soloplay = true;
            case 2: soloplay = false;
        }
        int matchesQuant = 11;
        boolean turn = true;
        Scanner input = new Scanner(System.in);
        while ((matchesQuant > 0)) {
            if (turn) {
                System.out.println("Всего " + matchesQuant + " спичек. Игрок " + (turn ? 1 : 2) + " введите количество спичек от 1 до 3");
                int select = Integer.valueOf(input.nextLine());
                if ((select < 1) | (select > 3)) {
                    System.out.println("Ведено некорректное число!");
                    continue;
                }
                matchesQuant = matchesQuant - select;
                turn = false;
            } else {
                int select = 1 + new Random().nextInt(2);
                System.out.println("Всего " + matchesQuant + 1" спичек. Игрок " + (turn ? 1 : 2) + " ходит2");
                matchesQuant = matchesQuant - select;
                turn = true;
                System.out.println(select);
            }
        }
        if (turn) {
            System.out.println("Игрок " + (turn ? 1 : 2) + " победил!");
        } else {
            System.out.println("Игрок " + (turn ? 1 : 2) + " победил!");
        }
    }
}
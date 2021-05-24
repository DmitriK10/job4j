package ru.job4j.tracker.iput;

import ru.job4j.tracker.iput.Input;

import java.util.Scanner;

/*
 * Консольный ввод.
 * @author Dmitrii K
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }
}
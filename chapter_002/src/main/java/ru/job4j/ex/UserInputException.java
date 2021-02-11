package ru.job4j.ex;
//0.4. Пользовательские исключения. [#219367] - пример
public class UserInputException extends Exception {
    public UserInputException(String message) {
        super(message);
    }
}
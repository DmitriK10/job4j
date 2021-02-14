package ru.job4j.ex;

//0.5. Иерархия исключений и множественный catch. [#219368]
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
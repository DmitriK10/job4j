package ru.job4j.ex;

//0.5. Иерархия исключений и множественный catch. [#219368]
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}


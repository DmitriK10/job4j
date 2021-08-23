package ru.job4j.bank;

import java.util.Objects;

/**
 * 3. Банковские переводы [#10038]
 * Класс описывает модель клиента банка
 * @author Dmitrii Kupriyaniuk
 * @version 1.0
 */
public class User {
    /**
     * поле passport номера паспорта клиента, тип String
     * поле username имя пользователя, тип String
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод getPassport для доступа к полю класса
     * @return возвращает поле passport
     *
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод  задаёт значение поля с номером паспорта клиента
     * @param passport значение номера паспорта, которое записывается в соответствующее поле
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод getUsername для доступа к полю класса
     * @return возвращает поле username
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод  задаёт значение поля с именем клиента
     * @param username значение имени клиента, которое записывается в соответствующее поле
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *  Переопределение метода equals для корректной работы сравнения объетов класса,
     *  возвращает результат сравнения на эквивалентность passport и user.passport
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
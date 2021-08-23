package ru.job4j.bank;

    import java.util.Objects;

/**
 * 3. Банковские переводы [#10038]
 * Класс описывает модель банковского счета.
 * @author Dmitrii Kupriyaniuk
 * @version 1.0
 */
public class Account {
    /**
     * поле requisite реквизит счета пользователя, тип string
     * поле balance   баланс   счета пользователя, тип double
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор класса
     * @param requisite счет пользователя
     * @param balance   баланс счета пользователя
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод getRequisite для доступа к полю класса
     * @return возвращает поле requisite
     *
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод setRequisite устанавливает значение поля requisite
     * @param requisite присваивает полю requisite переданное значение
     *
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод getBalance для доступа к приватному полю класса
     * @return возвращает поле balance
     *
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод setBalance устанавливает значение поля balance
     * @param balance присваивает полю balance переданное значение
     *
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *  Переопределение метода equals для корректной работы сравнения объетов класса,
     *  возвращает результат сравнения на эквивалентность requisite и account.requisite
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
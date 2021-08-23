package ru.job4j.bank;

    import java.util.*;

/**
 * 3. Банковские переводы [#10038]
 * Класс описывает операции бансковского сервиса.
 * @author Dmitrii Kupriyaniuk
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных о клиенте банка и списке его счетов в коллекции типа HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента с пустым списком счетов в коллекцию
     * @param user клиент, который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет новый счет клиенту банка
     * Если клиент банка не был найден по номеру паспорта или такой счет уже существует,
     * то операция не выполняется
     * @param passport номер паспорта клиента
     * @param account банковский счет, который требуется добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user !=  null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск клиента банка по номеру паспорта
     * @param passport номер паспорта клиента
     * @return возвращает найденный клиент или null, если клиент не найден
     */
    public User findByPassport(String passport) {
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет по номеру паспорта и реквизитам счета
     * @param passport номер паспорта
     * @param requisite реквизиты банковского счета
     * @return возвращает банковский счет или null, если клиент не найден или
     * отсутствуют требуемые рекивизиты
     */
    //метод ищет счет пользователя по реквизита
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user !=  null) {
            for (Account account: users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денег со счета одного клиента на счет другого
     * @param srcPassport паспорт клиента, который осуществляет перевод денег
     * @param srcRequisite реквизиты счета, с которого осуществляют перевод денег
     * @param destPassport паспорт клиента, которому переводят деньги
     * @param destRequisite реквизиты счета клиента, которому переводят деньги
     * @param amount сумма денежного перевода
     * @return возвращает true, если операция проведена успешно и false,
     * если хотя бы один из клиентов или один из счетов не будет найден, или
     * суммы на счете будет недостаточно для перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

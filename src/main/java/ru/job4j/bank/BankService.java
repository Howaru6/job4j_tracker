package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Данный класс описывает сервис банка, с помощью которого
 * пользователь может управлять своими банковскими счетами.
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в список пользователей.
     * @param user добавляется в список.
    */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаляет пользователя из карты пользователей
     * по номеру паспорта.
     * @param passport номер паспорта.
     * @return статус нахождения и удаления пользователя.
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;

    }

    /**
     * Добавляет новый банковский счет для пользователя по номеру паспорта.
     * @param passport номер паспорта.
     * @param account профиль пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Находит паспорт по его номеру.
     * @param passport номер паспорта.
     * @return найденный по номеру паспор или null, если паспорт не найден.
     */
    public User findByPassport(String passport) {
        User findUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                findUser = user;
                break;
            }
        }
        return findUser;
    }

    /**
     * Находит банковский счет по номеру паспорта и счету.
     * @param passport номер паспорта.
     * @param requisite номер счета.
     * @return профиль пользователя или null, если профиль не был найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account findAccount = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    findAccount = account;
                    break;
                }
            }
        }
        return findAccount;
    }

    /**
     * Переводит деньги с одного счета на другой.
     * @param srcPassport номер паспорта отправителя.
     * @param srcRequisite номер счета отправителя.
     * @param destPassport номер паспорта получателя.
     * @param destRequisite номер счета получателя.
     * @param amount сумма перевода.
     * @return статус перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srsAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srsAccount != null && destAccount != null && srsAccount.getBalance() >= amount) {
            srsAccount.setBalance(srsAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Банковский счета которые есть у пользователя.
     * @param user пользователь.
     * @return список счетов пользователя, если они есть.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
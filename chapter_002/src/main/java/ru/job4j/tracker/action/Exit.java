package ru.job4j.tracker.action;

import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

/*
 * Выход из программы.
 * @author Dmitrii K
 */
public class Exit implements UserAction {
    @Override
    public String name() {
        return "Exit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}

package ru.job4j.tracker;

import ru.job4j.tracker.iput.Input;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
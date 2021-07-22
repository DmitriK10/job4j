package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.Output;

import java.util.List;

/*
 * Вывод списка всех item.
 * @author Dmitrii K
 */
public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all Items ====");
        List<Item> result = tracker.findAll();
        for (Item item : result) {
            out.println(item);
        }
        return true;
    }
}

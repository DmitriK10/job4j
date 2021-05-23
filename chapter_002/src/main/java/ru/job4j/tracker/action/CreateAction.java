package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.Output;

/*
 * Создание нового item.
 * @author Dnitrii K
 */
public class CreateAction implements UserAction {
    private Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    public CreateAction() {

    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
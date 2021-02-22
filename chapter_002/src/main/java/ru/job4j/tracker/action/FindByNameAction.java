package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;

/*
 * Поиск заявки по name.
 * @author Dmitrii K
 */
public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            out.println("Заявка с name: " + name + " не найдена! Проверьте корректность name");
        } else {
            for (int x = 0; x < items.length; x ++) {
                out.println("Item id: " + items[x].getId() + " name: " + items[x].getName());
            }
        }
        return true;
    }
}

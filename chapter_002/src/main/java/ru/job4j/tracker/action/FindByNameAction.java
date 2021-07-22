package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.Output;

import java.util.List;

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
        List<Item> items = tracker.findByName(name);
        if (items.size() == 0) {
            out.println("Заявка с name: " + name + " не найдена! Проверьте корректность name");
        } else {
            for (int x = 0; x < items.size(); x ++) {
                out.println("Item id: " + items.get(x).getId() + " name: " + items.get(x).getName());
            }
        }
        return true;
    }
}

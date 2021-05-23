package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.Output;

/*
 * Поиск заявки по id.
 * @author Dmitrii K
 */
public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find Item by id ====");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println("Item id: " + item.getId() + " name: " + item.getName());
        } else {
            out.println("Заявка с id: " + id + " не найдена! Проверьте корректность id");
        }
        return true;
    }
}
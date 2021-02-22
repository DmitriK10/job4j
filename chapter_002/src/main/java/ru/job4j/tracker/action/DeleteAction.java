package ru.job4j.tracker.action;

import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;
import ru.job4j.tracker.iput.Input;

/*
 * Удаление item по id.
 * @author Dnitrii K
 */
public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete a new Item ====");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            out.println("Item id:" + id +  " удалён");
        } else {
            out.println("Ошибка удаления. Проверьте точность данных");
        }
        return true;
    }
}
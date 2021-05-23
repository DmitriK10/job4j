package ru.job4j.tracker.action;

import ru.job4j.tracker.*;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.Output;

/*
 * Изменение существующего item.
 * @author Dmitrii K
 */
public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Replace";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Replace Item ====");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Заявка успешно обновлена!");
        } else {
            out.println("Ошибка замены! Проверьте корректность id");
        }
        return true;
    }
}
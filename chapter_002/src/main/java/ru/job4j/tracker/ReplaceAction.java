package ru.job4j.tracker;

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
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно обновлена!");
        } else {
            System.out.println("Ошибка замены! Проверьте корректность id");
        }
        return true;
    }
}
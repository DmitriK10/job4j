package ru.job4j.tracker;

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
            out.println("Заявка с name " + name + " не найдена!");
        } else {
            out.println("Поиск завершен");
        }
        return true;
    }
}

package ru.job4j.tracker;

/**
 * Поиск заявки по name.
 * @author Dmitrii K
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find by Name Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Заявка с name " + name + " не найдена!");
        } else {
            System.out.println("Поиск завершен");
        }
        return true;
    }
}

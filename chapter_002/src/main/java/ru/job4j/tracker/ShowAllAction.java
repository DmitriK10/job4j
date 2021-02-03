package ru.job4j.tracker;

/*
 * Вывод списка всех item.
 * @author Dmitrii K
 */
public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findAll();
        for (Item item : result) {
            System.out.println(item + " ");
        }
        return true;
    }
}

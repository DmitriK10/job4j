package ru.job4j.tracker;

/*
 * Вывод списка всех item.
 * @author Dmitrii K
 */
public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
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

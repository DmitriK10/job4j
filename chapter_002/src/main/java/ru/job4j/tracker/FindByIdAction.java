package ru.job4j.tracker;

/**
 * Поиск заявки по id.
 * @author Dmitrii K
 */
public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find by Id Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка не найдена. Проверьте корректность id");
        }
        return true;
    }
}
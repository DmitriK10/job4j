package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item id:" + id +  " удалён");
        } else {
            System.out.println("Ошибка удаления. Проверьте точность данных");
        }
        return true;
    }
}
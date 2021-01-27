package ru.job4j.tracker;
// 4.2. Статические методы. [#181779]

public class StartUI {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public static void finditemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter name:");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Заявка с name " + name + " не найдена!");
        } else {
            System.out.println("Поиск завершен");
        }
    }

    public static void finditemsByid(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка не найдена. Проверьте корректность id");
        }
    }

    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] result = tracker.findAll();
        System.out.println("Items: ");
        for (Item item : result) {
            System.out.println(item + " ");
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id,item)) {
            System.out.println("Заявка успешно обновлена!");
        } else {
            System.out.println("Ошибка замены! Проверьте корректность id");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Item " + input + " удалён");
        } else {
            System.out.println("Ошибка удаления. Проверьте точность данных");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                createItem(input, tracker);
            }   else if (select == 1) {
                    showAllItems(input, tracker);
            }   else if (select == 2) {
                    replaceItem(input, tracker);
            }   else if (select == 3) {
                    deteleItem(input, tracker);
            }   else if (select == 4) {
                    finditemsByid(input, tracker);
            }   else if (select == 5) {
                    finditemsByName(input, tracker);
            }   else if (select == 6) {
                    run = false;
            }   else  if ((select > 6) | (select < 0)) {
                    System.out.println("=== Введено некоректное значение! ====");
            }

        }
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit");
    }
}





















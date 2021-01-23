package ru.job4j.tracker;
// 4.2. Статические методы. [#181779]

public class StartUI {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public static boolean createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }

    public static boolean replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean deteleItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String name = input.askStr("Enter name: ");
        if (tracker.detele(name)) {
            return true;
        } else {
            return false;
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
                System.out.println("=== Show all items ====");
                Item[] result = tracker.findAll();
                System.out.println("Items: ");
                for (Item item : result) {
                    System.out.println(item + " ");
                }
            }   else if (select == 2) {
                    if (replaceItem(input, tracker)) {
                        System.out.println("Замена произошла");
                    } else {
                        System.out.println("Ошибка замены. Проверьте точность данных");
                    }
            }   else if (select == 3) {
                    if (deteleItem(input, tracker)) {
                        System.out.println("Item " + input + " удалён");
                    } else {
                        System.out.println("Ошибка удаления. Проверьте точность данных");
                    }

            }   else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter id: ");
                int id = input.askInt("");
                Item item;
                item = tracker.findById(id);
                if (item.equals(null)) {
                    System.out.println("Заявка с id " + id + " не найдена!");
                } else {
                    System.out.println("Результат поиска:" + item.getId() + " " + item.getName());
                }
            }   else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Enter name: ");
                String name = input.askStr("");
                Item[] items = tracker.findByName(name);
                if (items.length == 0) {
                    System.out.println("Заявка с name " + name + " не найдена!");
                } else {
                    System.out.println("Поиск завершен");
                }
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
    }
}





















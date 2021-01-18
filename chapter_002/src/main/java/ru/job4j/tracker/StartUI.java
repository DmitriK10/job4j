package ru.job4j.tracker;
//4.1. Разрыв зависимости StartUI от Scanner. [#181778]

public class StartUI {
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = input.askStr("");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item " + item + " добавлен");
            }   else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] result = tracker.findAll();
                System.out.println("Items: ");
                for (Item item : result) {
                    System.out.println(item + " ");
                }
            }   else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                int id = input.askInt("");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                Item newItem = new Item();
                newItem.setName(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Item изменён");
                } else {
                    System.out.println("Неудача");
                }
            }   else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter id: ");
                int id = input.askInt("");
                if (tracker.delete(id)) {
                    System.out.println(" Item " + id + " удалён");
                } else {
                    System.out.println(" Неудача Item " + id + " не удалён!");
                }
            /*}  else if (select == *) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.deleteByName(name)) {
                    System.out.println(" Item " + name + " удалён");
                } else {
                    System.out.println(" Неудача Item " + name + " не удалён!");
                }
                tracker.deleteByName(name);*/
            }   else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter id: ");
                int id = input.askInt("");
                Item item; //0 = new Item();
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
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }
}

/*//2.1. Реализация класса StartUI [#784]
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item " + item + " добавлен");
            }   else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] result = tracker.findAll();
                System.out.println("Items: ");
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i] + " ");
                }
            }   else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item();
                newItem.setName(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Item изменён");
                } else {
                    System.out.println("Неудача");
                }
            }   else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println(" Item " + id + " удалён");
                } else {
                    System.out.println(" Неудача Item " + id + " не удалён!");
                }
            *//*}  else if (select == *) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.deleteByName(name)) {
                    System.out.println(" Item " + name + " удалён");
                } else {
                    System.out.println(" Неудача Item " + name + " не удалён!");
                }
                tracker.deleteByName(name);*//*
            }   else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("Enter id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item item = new Item();
                item = tracker.findById(id);
                if (item.equals(null)) {
                    System.out.println("Заявка с id " + id + " не найдена!");
                } else {
                    System.out.println("Результат поиска:" + item.getId() + " " + item.getName());
                }
            }   else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
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
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}*/

/*import java.util.Arrays;

*//*5. tracker - хранилище [#396]
 *//*
public class StartUI {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];
        int sizeA = 0;
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (name != null) {
                namesWithoutNull[sizeA] = name;
                sizeA++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, sizeA);
        Tracker tracker = new Tracker();
        System.out.println("-----Add-------");
        for (int index = 0; index < namesWithoutNull.length; index++) {
            Item item = new Item();
            item.setId(index);
            item.setName(namesWithoutNull[index]);
            System.out.println(tracker.add(item).getName());
        }
        System.out.println("-----findAll-------");
        System.out.println(tracker.findAll());
        System.out.println("-----findByName-------");
        System.out.println("Ivan" + tracker.findByName("Ivan"));
        System.out.println("-----findById 1-------");
        System.out.println(tracker.findById(1).getName());

        System.out.println();
        Item item = new Item();
        item.setId(1);
        item.setName("Ivan");
        System.out.println(item);
    }
}*/



/*
public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "root");
        System.out.println(item);
    }
}
*/
/*

public class StartUI {
    */
/* Константа меню для добавления новой заявки.
            *//*

    private static final String ADD = "0";

     */
/* Констатнта для получения всех заявок.
      *//*

    private static final String FINDALL = "1";

    */
/* Констатнта для редактирования заявки.
            *//*

    private static final String EDITITEM = "2";

    */
/* Констатнта для удаления заявки.
            *//*

    private static final String DELETE = "3";

    */
/* Констатнта для поиска заявок по Id.
            *//*

    private static final String FINDBYID = "4";

    */
/* Констатнта для поиска заявок по Name.
            *//*

    private static final String FINDBYNAME = "5";

    */
/* Констатнта для выхода из программы.
     *//*

    private static final String EXIT = "6";

    */
/* Получение данных от пользователя.
            *//*

    private final Input input;

    */
/* Хранилище заявок.
            *//*

    private final tracker tracker;

    */
/* Конструктор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     *//*

    public StartUI(Input input, tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }*/

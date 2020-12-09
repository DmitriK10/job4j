package ru.job4j.tracker;

import java.util.Arrays;

/*5. Tracker - хранилище [#396]
 */
public class StartUI {
    /**
     * @noinspection checkstyle:NoWhitespaceBefore
     */
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
            tracker.add(item);
        }
        System.out.println("-----findAll-------");
        tracker.findAll();
        System.out.println("-----findByName-------");
        tracker.findByName("Ivan");
        System.out.println("-----findById 1-------");
        System.out.println(tracker.findById(1));

    }
}



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

    private final Tracker tracker;

    */
/* Конструктор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     *//*

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }*/

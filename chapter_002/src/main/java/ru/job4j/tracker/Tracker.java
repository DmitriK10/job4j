package ru.job4j.tracker;

import java.util.Arrays;

//8. Что такое валидация? [#246864]
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //  добавление нового item
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //  получение списка всех item
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    //  поиск item по id
    public Item findById(int id) {
        //* Находим индекс *//*
        int index = indexOf(id);
        //* Если индекс найден возвращаем item, иначе null *//*
        return index != -1 ? items[index] : null;
    }

    //  метод  возвращает index по id.
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод реализует замену заявку. по id.
     * @param id номер заявки;
     * @param item новая заявка;
     * @return result результат выполнения операции.
     */
    public boolean replace(int id, Item item) {
        if (id <= 0) {
            System.out.println("Некорректный параметр " + id + "!");
            return false;
        }
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);         // устанавливаем добавляемой заявке id, чтобы мы потом смогли ее найти
            items[index] = item;    // делаем вставку

        } else {
            System.out.println("Элемент " + id + " не найден!");
        }

        return rsl;
    }

    //  получение списка по имени
    public Item[] findByName(String name) {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = this.items[i];
            if (item.getName().equals(name)) {
                itemsWithoutNull[count] = this.items[i];
                System.out.println(itemsWithoutNull[count].getName());
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    /**
     * Метод реализует удаления заявки по id.
     * @param id номер заявки;
     * @return result результат выполнения операции.
     */
    public boolean delete(int id) {
        boolean result = false;
        if (id <= 0) {
            System.out.println("Некорректный параметр " + id + "!");
            return result;
        }
        int index = indexOf(id);
        if (index == -1) {
            System.out.println("Элемент " + id + " не найден!");
            return result;
        }
        int start = index + 1;
        int distPos = index;
        int length = size - index;
        System.arraycopy(items, start, items, distPos, length);
        items[size - 1] = null;
        size--;
        return true;
    }
}

/*6. Метод замены заявки. tracker.replace [#211748]

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    //  добавление нового item
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    //  получение списка всех item
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    //  поиск item по id
    public Item findById(int id) {
        //* Находим индекс *//*
        int index = indexOf(id);
        //* Если индекс найден возвращаем item, иначе null *//*
        return index != -1 ? items[index] : null;
    }

    //  метод  возвращает index по id.
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    //  метод заменяет заявку.
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = false;
        if (index == -1) {
            System.out.println("Элемент " + id + " не найден!");
            return result;
        }
        item.setId(id);         // устанавливаем добавляемой заявке id, чтобы мы потом смогли ее найти
        items[index] = item;    // делаем вставку
        return true;
    }

    //  получение списка по имени
    public Item[] findByName(String name) {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
             Item item = this.items[i];
             if (item.getName().equals(name)) {
                 itemsWithoutNull[count] = this.items[i];
                 System.out.println(itemsWithoutNull[count].getName());
                 count++;
             }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    //  удаления заявки по id
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = false;
        if (index == -1) {
            System.out.println("Элемент " + id + " не найден!");
            return result;
        }
        int start = index + 1;
        int distPos = index;
        int length = size - index;
        System.arraycopy(items, start, items, distPos, length);
        items[size - 1] = null;
        size--;
        return true;
    }
}


/*5. tracker - хранилище [#396]
 end */

/*5. tracker - хранилище [#396]

public class tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        size = ids;
        items[size] = item;
        System.out.println(items[ids].getName() + " " + size);
        item.setId(ids++);
        return item;
    }

    public Item[] findAll() {
        String itemsStr = "";
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i <= size; i++) {
            Item item = items[i];
            if (items[i] != null) {
                System.out.println(items[i].getName());
                itemsWithoutNull[count] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    public Item findById(int id) {
        Item rsl = null;
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = this.items[i];
            if ((this.items[i] != null)) {
                if (item.getId() == (id)) {
                    itemsWithoutNull[count] = this.items[i];
                    System.out.println(item.getName());
                    rsl = this.items[i];
                    break;
                }
            }
        }
        return rsl;
    }
//    получение списка по имени
    public Item[] findByName(String name) {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = this.items[i];
            if ((this.items[i] != null)) {
                if (item.getName().equals(name)) {
                    itemsWithoutNull[count] = this.items[i];
                    System.out.println(itemsWithoutNull[count]);
                    count++;
                }
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);

    }
}
/*5. tracker - хранилище [#396]
 end */


/*package ru.job4j.tracker;

public class tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}*/


/*
package ru.job4j.tracker;

*/
/**
 * @version $Id$
 * @since 0.1
 *//*

public class tracker {
    */
/**
     * Массив для хранение заявок.
     *//*

    private final Item[] items = new Item[100];

    */
/**
     * Указатель ячейки для новой заявки.
     *//*

    private int position = 0;

    */
/**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     *//*

    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    */
/**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     *//*

    private String generateId() {
        //Реализовать метод генерации.
        return null;
    }
}*/

package ru.job4j.tracker;

import java.util.Arrays;

/*5. Tracker - хранилище [#396]
 */
public class Tracker {
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
        for (int i = 0; i < size; i++) {
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
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
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
                    count++;
                }
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }
}

/*package ru.job4j.tracker;

public class Tracker {
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

public class Tracker {
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

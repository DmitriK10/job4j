package ru.job4j.tracker;

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
}


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

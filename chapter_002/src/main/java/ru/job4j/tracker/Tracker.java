package ru.job4j.tracker;
//6. Изменить программу Tracker из 2-го модуля [#10039]

/*
 * Система заявок - Tracker.
 * @author Dmitrii K
 */

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    //  добавление нового item
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    //  получение списка всех item
    public List<Item> findAll() {
        return List.copyOf(items);
    }

    //  поиск item по id
    public Item findById(int id) {
        //* Находим индекс *//*
        int index = indexOf(id);
        //* Если индекс найден возвращаем item, иначе null *//*
        return index != -1 ? items.get(index) : null;
    }

    //  метод  возвращает index по id.
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
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
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);            // устанавливаем добавляемой заявке id, чтобы мы потом смогли ее найти
            items.set(index, item);    // делаем вставку0
        }

        return rsl;
    }

    //  получение списка по имени
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item element : items) {
            if (element.getName().equals(key)) {
                result.add(element);
            }
        }
        return result;
    }

    //  удаления заявки по id
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = false;
        if (index == -1) {
            System.out.println("Элемент " + id + " не найден!");
            return result;
        }
        items.remove(index);
        return true;
    }
}






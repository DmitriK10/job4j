package ru.job4j.tracker;

import java.util.Arrays;

//2. Singleton [#94606]
public class SingleTracker {
    private Tracker tracker = new Tracker();

    /* реализовать singleton */
    private static SingleTracker instance = null;

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return  tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public Item[] findByName(String name) {
        return tracker.findByName(name);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
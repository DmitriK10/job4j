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
        return null;
    }

    public Item[] findAll() {
        return null;
    }

    public boolean replace(int id, Item item) {
        return Boolean.parseBoolean(null);
    }

    public Item[] findByName(String name) {
        return null;
    }

    public boolean delete(int id) {
        return Boolean.parseBoolean(null);
    }

    private int indexOf(int id) {
        return Integer.parseInt(null);
    }
}
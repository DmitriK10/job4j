package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

// 2. Очередь с приоритетом на LinkedList [#41670]
public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenLowerPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 3));
        queue.put(new Task("low", 1));
        Task result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }

    @Test
    public void whenHigherPriority2() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("middle2", 3));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenTwoHigherPriorit() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("nearlow", 4));
        queue.put(new Task("lowmidle", 2));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("superurgent", 0));
        queue.put(new Task("low", 5));

        Task result = queue.take();
        assertThat(result.getDesc(), is("superurgent"));
    }
}
/*package ru.job4j.tracker;

import org.junit.Test;

public class StartUITestOld {
        }

        /*@Test
            public void whenCreateItem() {
                Input in = new StubInput(
                        new String[] {"0", "Item name", "1"}
                );
                Tracker tracker = new Tracker();
                UserAction[] actions = {
                        new CreateAction(),
                        new Exit()
                };
                new StartUI().init(in, tracker, actions);
                assertThat(tracker.findAll()[0].getName(), is("Item name"));
            }

            @Test
            public void whenReplaceItem() {
                Tracker tracker = new Tracker();
                /* Добавим в tracker новую заявку */
        /*Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        /*String replacedName = "New item's name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1  "}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new Exit()
        };
        new StartUI().init(in, tracker, actions);
                assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
                }

@Test
public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        /*Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        /*/Input in = new StubInput(
        new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
        new DeleteAction(),
        new Exit()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
        }*/

/*
package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), */
/* id сохраненной заявки в объект tracker. *//*

                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()), */
/* id сохраненной заявки в объект tracker. *//*

                "deleted item"
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        Integer iAmNull = null;
        assertThat(deleted, is(iAmNull));
    }

}*/
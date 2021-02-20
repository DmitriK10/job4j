package ru.job4j.tracker;
//9.2. Тесты вывода на консоль [#33585]
import org.junit.Test;
import static org.hamcrest.Matchers.is;
//import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAllAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Show all" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Show all Items ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Show all" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindName() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Find item", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("New item 1"));
        UserAction[] actions = {
                new FindByNameAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by Name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find Item by name ====" + System.lineSeparator() +
                        "Заявка с name: Find item не найдена! Проверьте корректность name" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by Name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindName2() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "New item 1", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("New item 1"));
        tracker.add(new Item("New item 2"));
        tracker.add(new Item("New item 1"));
        UserAction[] actions = {
                new FindByNameAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by Name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find Item by name ====" + System.lineSeparator() +
                        "Item id: 1 name: New item 1" + System.lineSeparator() +
                        "Item id: 3 name: New item 1" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by Name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFindId() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindByIdAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find Item by id ====" + System.lineSeparator() +
                        "Заявка с id: 1 не найдена! Проверьте корректность id" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindId2() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "2", "1"}
        );
        Tracker tracker = new Tracker();
        tracker.add(new Item("New item 1"));
        tracker.add(new Item("New item 2"));
        tracker.add(new Item("New item 3"));
        UserAction[] actions = {
                new FindByIdAction(out),
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        "=== Find Item by id ====" + System.lineSeparator() +
                        "Item id: 2 name: New item 2" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    //1.1. Тесты на StartUI.
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1","0"}
/* Пункты меню: неверный, верный.*/
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));
    }

}


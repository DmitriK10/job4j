package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
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
                        "Заявка с name Find item не найдена!" + System.lineSeparator() +
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
                        "Заявка не найдена. Проверьте корректность id" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by Id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

}


//1. Обеспечить бесперебойную работу приложения Tracker [#789]
/*
 * Касс для работы с Tracker
 * @author Dmitrii K
 */
package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.iput.ConsoleInput;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.Output;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                out.println("Wrong input, you can select: 0 .. " + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }
    private void showMenu(UserAction[] actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ShowAllAction(output),
                new DeleteAction(output),
                new ReplaceAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new Exit()
        };
        new StartUI(output).init(input, tracker, actions);
    }

}
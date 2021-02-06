package ru.job4j.tracker;
// 8. Реализация меню за счет шаблона стратегия. [#181780]
/*
 * Касс для работы с Tracker
 * @author Dmitrii K
 */
public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),     //Create item
                new ShowAllAction(),    //Show all items
                new DeleteAction(),     //Delete item
                new ReplaceAction(),    //Edit item
                new FindByIdAction(),   //Find item by Id
                new FindByNameAction(),  //Find items by name*/
                new Exit()        //Exit //
        };
        new StartUI().init(input, tracker, actions);
    }
}


















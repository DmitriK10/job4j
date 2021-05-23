package ru.job4j.tracker;
//2.1. Тест на ValidateInput

import org.junit.Test;
import ru.job4j.tracker.iput.Input;
import ru.job4j.tracker.iput.StubInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"fjw", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(3));
    }

    @Test
    public void whenMultiValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"4", "6", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(4));
        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2, is(6));
        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3, is(1));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}
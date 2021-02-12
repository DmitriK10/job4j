package ru.job4j.ex;
//0.3. Тестирование исключений с junit [#219366]
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
/*    @Test(expected = IllegalArgumentException.class)
    public void when5() {
        Fact fast = new Fact();
        int x = fast.calc(5);
        assertThat(x, is(120));
    }

    @Test(expected = IllegalArgumentException.class)
    public void when0() {
        Fact fast = new Fact();
        int x = fast.calc(0);
        assertThat(x, is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenzero() {
        Fact fast = new Fact();
        int x = fast.calc(0);
        assertThat(x, is(1));
    }*/

    @Test(expected = IllegalArgumentException.class)
    public void whennegative() {
        Fact fast = new Fact();
        int x = fast.calc(-5);
        assertThat(x, is(120));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whennegative2() {
        Fact fast = new Fact();
        int x = fast.calc(-10);
        assertThat(x, is(3628800));
    }
}
package ru.job4j.ex;
//3. Замена if-else-throw на if-throw
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FindTest {

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
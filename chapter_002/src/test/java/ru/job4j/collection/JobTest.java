package ru.job4j.collection;
//2. Комбинированный компаратор [#10036]

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByDescPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorArcByName() {
        Comparator<Job> cmpNamePriority = new JobAscByNameLn();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorByArcPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenAscCombCmp() {
        Comparator<Job> cmpAsc = new JobAscByNameLn().thenComparing(new JobAscByPriority());
        int rsl = cmpAsc.compare(
                new Job("task1", 0),
                new Job("task1", 2));
        assertThat(rsl, lessThan(2));
    }
    @Test
    public void whenDescCombCmp() {
        Comparator<Job> cmpDesc = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDesc.compare(
                new Job("task1 task", 2),
                new Job("task1 task", 1));
        assertThat(rsl, lessThan(0));
    }

}
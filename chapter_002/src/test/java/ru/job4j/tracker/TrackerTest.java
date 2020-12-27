package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {

        @Test
        public void whenReplace() {
                Tracker tracker = new Tracker();
                Item bug = new Item();
                bug.setName("Bug");
                tracker.add(bug);
                int id = bug.getId();
                Item bugWithDesc = new Item();
                bugWithDesc.setName("Bug with description");
                tracker.replace(id, bugWithDesc);
                assertThat(tracker.findById(id).getName(), is("Bug with description"));
        }

        @Test
        public void whenDelete() {
                Tracker tracker = new Tracker();
                Item bug = new Item();
                bug.setName("Bug");
                tracker.add(bug);
                int id = bug.getId();
                tracker.delete(id);
                assertThat(tracker.findById(id), is(nullValue()));
        }

        @Test
        public void whenDelete2() {
                Tracker tracker = new Tracker();
                Item bug = new Item();
                bug.setName("Bug");
                tracker.add(bug);
                int id = bug.getId();
                Item item = new Item();
                item.setName("Ivan");
                tracker.add(item);
                int id2 = item.getId();
                tracker.delete(id);
                assertThat(tracker.findById(id), is(nullValue()));
        }
}


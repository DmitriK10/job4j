package ru.job4j.tracker;

/* 9. toString [#310018]
*/
public class Item {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Item{" + "id=" + id +  ", name='" + name + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*package ru.job4j.tracker;

*//*5. tracker - хранилище [#396]
**
**
 *//*
public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/

/*
package ru.job4j.tracker;

public class Item {
    private int id;

    private String item;

    public Item(int id, String item) {
        this.id = id;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", item='" + item + '\''
                + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return item;
    }

    public void setName(String item) {
        this.item = item;
    }
}
*/





/*
package ru.job4j.tracker;

public class Item {

    */
/*public Item() {
        super();
        System.out.println("load item");
    }

    public static void main(String[] args) {
        Bug bug = new Bug();
    }*//*


    public Item() {
    }

    public Item(String name) {
    }

    public static void main(String[] args) {
        Item item = new Item();
    }
}*/
/*
package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/

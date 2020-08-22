package ru.job4j;

public class Book {
    private String title;
    private int pagecount;

    public Book(String title, int pagecount) {
        this.title = title;
        this.pagecount = pagecount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
}
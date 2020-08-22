package ru.job4j;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Clean code 2", 150);
        Book book3 = new Book("Clean code 3", 50);
        Book book4 = new Book("Clean code 4", 200);

        Book[] books = new Book[4];

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPagecount());
        }

        System.out.println("Change Clean code to Clean code 4");
        String titleTMP = books[0].getTitle();
        int pagecountTMP = books[0].getPagecount();
        books[0].setTitle(book4.getTitle());
        books[0].setPagecount(book4.getPagecount());
        books[3].setTitle(titleTMP);
        books[3].setPagecount(pagecountTMP);

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getPagecount());
        }

        System.out.println("Show book with title Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getTitle().equals("Clean code")) {
                System.out.println(bk.getTitle() + " - " + bk.getPagecount());
            }
        }
    }
}
package Advanced_A4;

import Advanced_A4.Product;

public class Book extends Product {

    String title;
    int pages;
    String author;

    public Book(String name, String descr, int price, String title, int pages, String author) {
        super(name, descr, price);
        this.title = title;
        this.pages = pages;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }
}

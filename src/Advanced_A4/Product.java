package Advanced_A4;

public class Product {

    private String name;
    private String descr;
    private int price;

    public Product(String name, String descr, int price) {
        this.name = name;
        this.descr = descr;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescr() {
        return descr;
    }

    public int getPrice() {
        return price;
    }
}

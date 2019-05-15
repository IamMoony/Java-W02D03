package Advanced_A4;

public class Advanced_A4 {

    public static void main(String[] args) {

    Product p1 = new Product("The Product", "It is really good", 10);
    System.out.println(p1.toString());

    ElectronicBook e1 = new ElectronicBook("The Book", "It is really interesting", 15, "The Book", 120, "The Author", "PDF");
    System.out.println(e1.toString());
    System.out.println(e1.getDescr());
    }
}

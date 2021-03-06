package Advanced_A4;

public class PhysicalBook extends Book {

    private String weight;

    public PhysicalBook(String name, String descr, int price, String title, int pages, String author, String weight) {
        super(name, descr, price, title, pages, author);
            this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PhysicalBook{" +
                "weight='" + weight + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}

package Advanced_A4;

public class Dog extends Pets {

    private String type;

    public Dog(String name, String descr, int price, String race, String type) {
        super(name, descr, price, race);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

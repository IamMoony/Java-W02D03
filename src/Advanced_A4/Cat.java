package Advanced_A4;

public class Cat extends Pets {

    String type;

    public Cat(String name, String descr, int price, String race) {
        super(name, descr, price, race);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

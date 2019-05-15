package Advanced_A4;

public class Pets extends Product {

    private String race;

    public Pets (String name, String descr, int price, String race) {
        super(name, descr,price);
        this.race = race;
    }

    public String getRace() {
        return race;
    }


}

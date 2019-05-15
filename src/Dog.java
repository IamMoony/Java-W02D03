public class Dog {

    private String name;
    private String race;
    private int yearOfBirth;
    private String dogOwner;

    public Dog(String name, String race, int yearOfBirth, String dogOwner) {
        this.name = name;
        this.race = race;
        this.yearOfBirth = yearOfBirth;
        this.dogOwner = dogOwner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public String getDogOwner() {
        return this.dogOwner;
    }

    public String getYearOfBirth() {
        return "The dog " + this.name + " was born " + this.yearOfBirth;
    }
}


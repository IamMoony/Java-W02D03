public class Employee {

    private String name;
    private String surname;
    private int yearOfBirth;
    private double salary;

    public Employee(String name, String surname, int yearOfBirth, double salary) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
}

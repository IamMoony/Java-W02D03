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

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public int getYearOfBirth(){
        return this.yearOfBirth = yearOfBirth;
    }








}

public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String classNumber;

    private Student (String firstName, String lastName, int birthYear, String classNumber){
         this.firstName = firstName;
         this.lastName = lastName;
         this.birthYear = birthYear;
         this.classNumber = classNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public String getClassNumber(){
        return this.classNumber;
    }

    public void setClassNumber(String classNumber){
        this.classNumber = classNumber;
    }
}

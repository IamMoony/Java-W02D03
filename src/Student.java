public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String classNumber;
    private int age;

    public Student (String firstName, String lastName, int birthYear, String classNumber, int age){
         this.firstName = firstName;
         this.lastName = lastName;
         this.birthYear = birthYear;
         this.classNumber = classNumber;
         this.age = age;
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

    public int getAge(int nowYear) {
        int age = 0;
        age = nowYear - birthYear;
        return age;
    }

    public String toString() {
        String data = this.firstName + " " + this.lastName + " born on " + birthYear + ", age " + age + ", goes to class " + classNumber;
        return data;
    }
}

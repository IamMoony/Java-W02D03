public class Intermediate_A3 {

    public static void main(String[] args) {


        Student s1 = new Student("Simon", "Blaha", 1990, "4b", 28);
        Student s2 = new Student("Judith", "Lang", 1936, "4a", 65);
        Student s3 = new Student("Mark", "Makadelia", 1995, "4b", 15);

        Student data[] = {s1, s2, s3};

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].getFirstName() + " " + data[i].getLastName());
        }
    }
}
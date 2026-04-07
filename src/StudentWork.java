public class StudentWork {
    public static void main(String[] args) {
        Student.school="Diamond School";
        Student s1 = new Student();
        s1.name="David";
        s1.address="Dumre";
        System.out.println(Student.school);
        System.out.println(s1.name );
        System.out.println(s1.school);
    }
}
class Student {
    String name;
    String address;


    static String school;
}

package OOPS;
class Student1 {
    String name;
    int age;
    String gender;
    String  studyingclass;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.studyingclass);
    }
}
public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Anju";
        s1.age  = 18;
        s1.gender = "Female";
        s1.studyingclass = "Degee 3rd sem";

        s1.printInfo();
    }
}

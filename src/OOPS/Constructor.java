package OOPS;
class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student3 s3 = new Student3("Anju", 18);
        s3.printInfo();
    }
}

package OOPS;
class Student4 {
    static String name;
    static String school;

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class Static {
    public static void main(String[] args) {
        Student4.name = "Anju";
        Student4.school = "AkkaMahadevi";
    }
}

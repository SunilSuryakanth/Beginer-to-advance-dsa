package OOPS;
class Shape{
    String colour;

}

class Triangle extends Shape {

}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "Blue";//extend from shape
    }
}

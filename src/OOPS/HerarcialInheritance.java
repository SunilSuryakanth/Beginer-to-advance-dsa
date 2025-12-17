package OOPS;
class Shape1 {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle1 extends Shape1 {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class EqulitralTriange extends Triangle1 {     //Multilevel inheritance
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape1 {                //Hirarcial inheritance
    public void area(int r) {
        System.out.println(Math.PI*r*r);
    }
}


public class HerarcialInheritance {
    public static void main(String[] args) {

    }
}

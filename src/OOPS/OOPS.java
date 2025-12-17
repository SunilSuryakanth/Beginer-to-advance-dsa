package OOPS;

class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Writing something");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "Blue";
        pen1.type = "Ball Point";

        pen1.write();
        System.out.println(pen1.colour);
        System.out.println(pen1.type);
    }
}

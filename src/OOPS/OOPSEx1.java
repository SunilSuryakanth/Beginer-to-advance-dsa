package OOPS;
class Pen1 {
    String colour;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class OOPSEx1 {
    public static void main(String[] args) {
        Pen1 pen1 = new Pen1();
        pen1.colour = "Red";
        pen1.type = "gel";

        Pen1 pen2 = new Pen1();
        pen2.colour = "Pink";
        pen2.type = "Sketch";

        pen1.printColour();
        pen2.printColour();

        pen1.printType();
        pen2.printType();

    }
}

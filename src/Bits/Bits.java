package Bits;

public class Bits {
    public static void main(String[] args) {
        int number = 5; //0101
        int pos = 2;
        int bitMast = 1<<pos;

        if((bitMast & number) == 0) {
            System.out.println("Bit was Zero");
        } else {
            System.out.println("Bit was One");
        }
    }
}

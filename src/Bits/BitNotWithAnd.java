package Bits;

public class BitNotWithAnd {
    public static void main(String[] args) {
        int n= 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitmast = ~(bitMask);

        int newNumber = notBitmast & n;
        System.out.println(newNumber);
    }
}

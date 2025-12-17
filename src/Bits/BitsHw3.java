package Bits;

public class BitsHw3 { //Clear bit
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 2;
        int bitMask = 1<<position;
        int newBitmask = ~(bitMask);
        int newumber = newBitmask & n;
        System.out.println(newumber);
    }
}

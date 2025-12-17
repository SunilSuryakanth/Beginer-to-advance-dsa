package Bits;

public class BitsHw2 { //set bit
    public static void main(String[] args) {
        int n = 5; //0101
        int position = 3;
        int bitMask = 1<<position;

        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
}

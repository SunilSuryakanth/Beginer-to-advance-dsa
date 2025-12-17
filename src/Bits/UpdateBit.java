package Bits;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n=5;
        int position = 1;

        int bitmask = 1<<position;
        if(operation == 1) {
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitmask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}

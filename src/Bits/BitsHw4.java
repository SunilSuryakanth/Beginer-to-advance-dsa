package Bits;

import java.util.Scanner;

public class BitsHw4 { //Update bit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        //oper = 1 -> set; operation = 0 -> clear
        int n = 5;
        int position = 1;

        int bitMask = 1<<position;
        if(operation == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}

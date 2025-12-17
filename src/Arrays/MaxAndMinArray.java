package Arrays;

import java.util.Scanner;

public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArr = new int[size];

        for (int i=0; i<size; i++) {
            numArr[i] = sc.nextInt();
        }
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i=0; i<numArr.length; i++) {
            if(numArr[i] < Min) {
                Min = numArr[i];
            }
            if (numArr[i] > Max) {
                Max = numArr[i];
            }
        }
        System.out.println("Largest number is: " + Max);
        System.out.println("Smallestnumber is: " + Min);

    }

}

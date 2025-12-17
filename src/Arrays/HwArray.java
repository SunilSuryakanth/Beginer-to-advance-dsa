package Arrays;

import java.util.Scanner;

public class HwArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArr = new int[size];

        for (int i=0; i<size; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}

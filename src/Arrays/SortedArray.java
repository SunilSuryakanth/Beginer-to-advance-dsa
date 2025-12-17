package Arrays;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAsending = true;

        for (int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAsending = false;
            }
        }

        if(isAsending) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}

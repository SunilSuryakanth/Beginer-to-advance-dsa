package FunctionsAndVariables;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class GreaterCheck {
    public static int greaterOfTwoNumbers(int first, int second) {
        if (first > second) {
            return first;
        } else {
             return second;
        }
    }
    public static void main(String[] args) {
        System.out.print("Please enter the number which you want to check: ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(greaterOfTwoNumbers(first, second));
    }
}

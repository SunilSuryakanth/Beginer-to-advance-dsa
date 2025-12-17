package FunctionsAndVariables;

import java.util.Scanner;

public class MulOfTwoNums {

    public static int mulOfTwoNumbers(int first, int second) {
//        int mul = first * second;
//        return mul;
        return first * second;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

//        int mul = mulOfTwoNumbers(first, second);
        System.out.println("Multiplication of two nums is: " + mulOfTwoNumbers(first, second));

    }
}

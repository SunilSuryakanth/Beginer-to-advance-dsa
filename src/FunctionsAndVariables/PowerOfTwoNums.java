package FunctionsAndVariables;

import java.util.Scanner;

public class PowerOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x: ");
        int x =sc.nextInt();
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        int result =1;
        for (int i=1; i<=n; i++) {
            result = result * x;
        }
        System.out.println("X to the Power n is: " + result);
    }
}

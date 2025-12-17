package FunctionsAndVariables;

import java.util.Scanner;

public class AgeCalculator {

    public static boolean isEligibleForVote(int age) {
        if (age > 18) {
          return true;
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligibleForVote(age));

    }
}

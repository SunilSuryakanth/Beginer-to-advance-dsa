import java.util.Scanner;

public class PracticeExcercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        do {
            int marks = sc.nextInt();

                if (marks >= 90 && marks <= 100) {
                    System.out.println("This is good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also good");
                } else if (marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks");
                }
            System.out.println("Want to continue ? (yes(1) or not(0)0");
        } while (input == 1);

    }
}
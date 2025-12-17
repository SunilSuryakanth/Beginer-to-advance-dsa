import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a age that you want to check Adult or not: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are not adult");
        }

    }
}

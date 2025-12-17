import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int Div = num1 / num2;
        int Mod = num1 % num2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(Div);
        System.out.println(Mod);
    }
}

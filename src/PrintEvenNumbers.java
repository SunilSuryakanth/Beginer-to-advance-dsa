import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell the number which you want to print till!: ");
        int num = sc.nextInt();

        for (int i=1; i<=num; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

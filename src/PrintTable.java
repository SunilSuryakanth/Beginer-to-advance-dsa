import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell the number which you want their table: ");
        int num = sc.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(num*i);
        }
    }
}
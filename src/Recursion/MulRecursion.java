package Recursion;

public class MulRecursion {
    public static void printmul(int i, int n, int mul) {
        if (i == n) {
            mul *= i;
            System.out.println(mul);
            return;
        }
        mul *= i;
        printmul(i + 1, n, mul);
    }
    public static void main(String[] args) {
        printmul(1, 5, 0);
    }
}

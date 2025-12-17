package Recursion;

public class LogNRecursion {

    public static int calcPow(int x, int n) {
        if(x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        } else {
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPow(x, n);
        System.out.println(ans);

    }
}

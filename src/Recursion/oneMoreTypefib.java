package Recursion;

public class oneMoreTypefib {
        public static void printfib(int a, int b, int i, int n) {
            if(i == n) {
                return;
            }
            int c = a + b;
            System.out.println(c);
            printfib(b, c, 0, n-1);
        }
        public static void main(String[] args) {
            int a = 0, b= 1;
            System.out.println(a);
            System.out.println(b);
            int n = 7;
            printfib(a, b, 0, n-2);
        }
}

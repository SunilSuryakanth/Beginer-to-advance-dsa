package Recursion;

public class Recursion {
    public  static  void printNumb1(int m)  {
        if(m == 6) {
            return;
        }
        System.out.print(m + " ");
        printNumb1(m+1);
    }
    public static void printNumb(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumb(n-1);
}
    public static void main(String[] args) {
        int m = 1;
        int n = 5;
        printNumb(n);
        System.out.println();
        printNumb1(m);

    }

}

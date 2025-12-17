package Recursion;


public class CalculateFactorial {
    public static int CFactotial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int factorial_nm1 = CFactotial(n-1);
        int fact_n = n * factorial_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = CFactotial(n);
        System.out.println(ans);

    }
}

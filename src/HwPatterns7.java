public class HwPatterns7 {
    public static void main(String[] args) {
        System.out.println("Print Pascal's Triangle.");
        /*
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1

         */
        int n=5;
        int num = 1;
        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            num = 1;
            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}

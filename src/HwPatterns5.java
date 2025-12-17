public class HwPatterns5 {
    public static void main(String[] args) {
        System.out.println("Hollow Butterfly.");
        /*

        *                  *
        * *              * *
        *   *          *   *
        *     *      *     *
        *        **        *
        *        **        *
        *      *    *      *
        *     *      *     *
        *   *          *   *
        *  *             * *
        *                  *

                           */

        int n=5;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if (j==1 || j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            int s=2*n-2*i;
            for (int j=1; j<=s; j++) {
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++) {
                if(j==1 || j==i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            int s = 2 * n - 2 * i;
            for (int j = 1; j <= s; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == i || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

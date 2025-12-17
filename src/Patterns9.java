public class Patterns9 {
    public static void main(String[] args) {
        /*
        1   //Using rows and colums ex: (1,1)
        0 1                             (2,1) (2,2)...
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */
        int n = 5;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

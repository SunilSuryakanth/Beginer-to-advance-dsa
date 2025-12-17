package Recursion;

public class Tiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int horPlacements = placeTiles(n-m, m);

        int verPlacements = placeTiles(n-1, m);
        return horPlacements + verPlacements;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        int total = placeTiles(n, m);
        System.out.println(total);

    }
}

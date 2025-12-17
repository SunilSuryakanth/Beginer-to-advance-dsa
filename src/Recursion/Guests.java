package Recursion;

public class Guests {
    public static int cellGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = cellGuests(n-1);
        int ways2 = (n-1) * cellGuests(n-2);
        return ways2 + ways1;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(cellGuests(n));
    }
}

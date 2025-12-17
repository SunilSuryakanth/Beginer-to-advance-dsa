package Recursion;

public class Hanoi {
    public  static void towerOfHanoi(int n, String sorce, String helper, String Destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + sorce+ " to " + Destination);
            return;
        }
        towerOfHanoi(n-1, sorce, Destination, helper);
        System.out.println("Transfer disk " + n + " from " + sorce+ " to " + Destination);
        towerOfHanoi(n-1, helper, sorce, Destination);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");

    }
}

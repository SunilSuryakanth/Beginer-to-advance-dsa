package Recursion;

public class SortedwidRecursion {
    public static boolean isSorted(int arr[], int indx) {
        if (indx == arr.length-1) {
            return true;
        }

       if (arr[indx] >= arr[indx+1]) {
           return false;
       } else {
           return isSorted(arr, indx+1);
       }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7};
        System.out.println(isSorted(arr, 0));
    }
}

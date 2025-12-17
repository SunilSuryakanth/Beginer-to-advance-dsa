package Recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString) {
        if(index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(index);
        if(map[currchar - 'a']) {
            removeDuplicates(str, index+1, newString);
        } else {
            newString += currchar;
            map[currchar -'a'] = true;
            removeDuplicates(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");

    }
}

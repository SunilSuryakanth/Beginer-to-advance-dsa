package Recursion;

import java.util.HashSet;

public class UniqSub {

    public static void subSequences(String str, int index, String newString, HashSet<String>set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        subSequences(str, index + 1, newString + currChar, set); //to be
        subSequences(str, index + 1, newString, set ); // not to be
    }
    public static void main(String[] args) {
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "", set);
    }
}
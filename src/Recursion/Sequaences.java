package Recursion;

public class Sequaences {
    public static void subSequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        subSequences(str, index+1, newString+currChar); //to be
        subSequences(str, index+1, newString); // not to be
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
    }
}

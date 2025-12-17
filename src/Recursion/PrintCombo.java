package Recursion;

public class PrintCombo {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwk", "yz"};

    public static void printCombo(String str, int index, String combination) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(index);
        String mapping = keypad[currchar -'0'];

        for (int i=0; i<mapping.length(); i++) {
            printCombo(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "8";
        printCombo(str, 0, "");
    }
}

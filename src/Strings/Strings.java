package Strings;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name1 = "Sunil";
        String fullName = "Sunil Koule";
        String sentence = "My Name is Sunil Koule";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println(sentence);
        System.out.println(fullName);
        System.out.println(name1);
    }
}

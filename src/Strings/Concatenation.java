package Strings;

public class Concatenation {
    public static void main(String[] args) {

    String firstName = "Sunil";
    String lastName = "Koule";
    String fullName = firstName +" "+ lastName;
    System.out.println(fullName);
    //fullname length
        System.out.println(fullName.length());
        //charAt
        for (int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

     }
}

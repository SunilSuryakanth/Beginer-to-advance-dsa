package Strings;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = "Sunil";
        String name2 = "Sunil";

        if(name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
        if (new String("Sunila").compareTo(new String("Sunila")) == 0)  {
            System.out.println("Equal");
        }  else {
            System.out.println("Not Equal");
        }
    }
}

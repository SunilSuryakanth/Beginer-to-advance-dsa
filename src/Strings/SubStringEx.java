package Strings;

public class SubStringEx {
    public static void main(String[] args) {
        String sentence = "My name is Sunil";
        String name = sentence.substring(11, sentence.length());
      //  System.out.println(name);

        String fullName = "SunilAnjuKoule";
        String name1 = fullName.substring(5,fullName.length());
        System.out.println(name1);
    }
}

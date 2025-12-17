public class QuizKarkeDekho {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int ans = a * b / a - b;  //BODMAS ruls not cundected in java;

        int ans1 = (a * b) / (a -b);
        System.out.println(ans);
        System.out.println(ans1);

    }
}
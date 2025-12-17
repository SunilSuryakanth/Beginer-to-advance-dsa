package FunctionsAndVariables;

import java.util.Scanner;

public class RadiusCalculator {

    public static Double getCircumference(Double radius) {
        return 2*Math.PI*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();

        System.out.println(getCircumference(radius));

    }
}

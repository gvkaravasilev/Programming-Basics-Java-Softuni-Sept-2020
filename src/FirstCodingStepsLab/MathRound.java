package FirstCodingStepsLab;

import java.util.Scanner;

public class MathRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());

        System.out.println(Math.round(a));
    }
}

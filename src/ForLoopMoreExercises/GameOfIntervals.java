package ForLoopMoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int steps = Integer.parseInt(scan.nextLine());
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        double result = 0;
        for (int i = 1; i <= steps; i++) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            double value = 0.0;
            if (currentNumber >= 0 && currentNumber <= 9) {
                value = currentNumber * 0.2;
                result += value;
                n1++;
            } else if (currentNumber >= 10 && currentNumber <= 19) {
                value = currentNumber * 0.3;
                result += value;
                n2++;
            } else if (currentNumber >= 20 && currentNumber <= 29) {
                result += currentNumber * 0.4;
                result += value;
                n3++;
            } else if (currentNumber >= 30 && currentNumber <= 39) {
                value += 50;
                result += value;
                n4++;
            } else if (currentNumber >= 40 && currentNumber <= 50) {
                value += 100;
                result += value;
                n5++;
            } else {
                result /= 2;
                n6++;
            }
        }
        //From 0 to 9: 10.00%
        //From 10 to 19: 10.00%
        //From 20 to 29: 20.00%
        //From 30 to 39: 10.00%
        //From 40 to 50: 30.00%
        //Invalid numbers: 20.00%
        System.out.printf("%.2f\n", result);
        System.out.printf("From to 0 to 9: %.2f%%\n", 1.0 * n1 / steps * 100);
        System.out.printf("From to 10 to 19: %.2f%%\n", 1.0 * n2 / steps * 100);
        System.out.printf("From to 20 to 29: %.2f%%\n", 1.0 * n3 / steps * 100);
        System.out.printf("From to 30 to 39: %.2f%%\n", 1.0 * n4 / steps * 100);
        System.out.printf("From to 40 to 50: %.2f%%\n", 1.0 * n5 / steps * 100);
        System.out.printf("Invalid numbers: %.2f%%", 1.0 * n6 / steps * 100);
    }
}

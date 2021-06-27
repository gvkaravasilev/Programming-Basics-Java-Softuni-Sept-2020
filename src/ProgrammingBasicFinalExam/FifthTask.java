package ForLoopsLab;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kidsCounter = 0;
        int adultsCounter = 0;
        int sumToys = 0;
        int sumPullovers = 0;
        String input = scan.nextLine();
        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(scan.nextLine());
            if (age <= 16) {
                kidsCounter++;
                sumToys += 5;
            } else {
                adultsCounter++;
                sumPullovers += 15;
            }
            input = scan.nextLine();
        }

        System.out.printf("Number of adults: %d%n",adultsCounter);
        System.out.printf("Number of kids: %d%n",kidsCounter);
        System.out.printf("Money for toys: %d%n",sumToys);
        System.out.printf("Money for sweaters: %d",sumPullovers);
    }
}

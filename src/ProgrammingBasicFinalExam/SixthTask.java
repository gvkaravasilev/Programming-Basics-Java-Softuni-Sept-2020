package ForLoopsLab;

import java.util.Scanner;

public class SixthTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int flightOperators = Integer.parseInt(scan.nextLine());
        int flightsCounter = 0;
        int sumPassengers = 0;
        double average = 0.0;
        double maxPassengers = 0;
        String operatorWithMaxPassengers = "";

        for (int i = 1; i <= flightOperators; i++) {
            String operatorName = scan.nextLine();
            String input = scan.nextLine();

            while (!input.equals("Finish")) {
                int currentPassengers = Integer.parseInt(input);

                sumPassengers += currentPassengers;
                flightsCounter++;

                input = scan.nextLine();
            }
            average = sumPassengers / flightsCounter;
            System.out.printf("%s: %.0f passengers.%n", operatorName, Math.floor(average));
            flightsCounter = 0;
            sumPassengers = 0;
            if (average > maxPassengers) {
                maxPassengers = average;
                operatorWithMaxPassengers = operatorName;
            }
        }
        System.out.printf("%s has most passengers per flight: %.0f", operatorWithMaxPassengers, Math.floor(maxPassengers));
    }
}

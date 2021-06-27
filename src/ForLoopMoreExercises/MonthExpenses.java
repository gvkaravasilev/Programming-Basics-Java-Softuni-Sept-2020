package ForLoopMoreExercises;

import java.util.Scanner;

public class MonthExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int months = Integer.parseInt(scan.nextLine());
        double water = 20;
        double internet = 15;
        double otherExpenses = 0;
        double totalElectricity = 0;
        double totalWater = 0;
        double totalInternet = 0;
        for (int i = 1; i <= months; i++) {
            double electricity = Double.parseDouble(scan.nextLine());
            totalWater = water * months;
            totalInternet = internet * months;

        }
        System.out.println();

    }


}

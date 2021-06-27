package ForLoopMoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loadsCount = Integer.parseInt(scan.nextLine());
        int busType = 0;
        int lorry = 0;
        int train = 0;
        int sumTons = 0;
        for (int i = 1; i <= loadsCount; i++) {
            int weight = Integer.parseInt(scan.nextLine());
            if (weight <= 3) {
                busType += weight;
            } else if (weight >= 4 && weight <= 8) {
                lorry += weight;
            } else if (weight >= 12) {
                train += weight;
            }
            sumTons += weight;
        }
        double microbusPrice = busType * 200;
        double lorryPrice = lorry * 175;
        double trainPrice = train * 120;
        double totalPrice = microbusPrice + lorryPrice + trainPrice;
        System.out.printf("%.2f\n", totalPrice/sumTons );
        System.out.printf("%.2f%%\n", 1.0 * busType / sumTons * 100);
        System.out.printf("%.2f%%\n", 1.0 * lorry / sumTons * 100);
        System.out.printf("%.2f%%\n", 1.0 * train / sumTons * 100);


    }
}

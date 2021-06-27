package ForLoopsLab;

import java.util.Scanner;

public class ForthTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int catCount = Integer.parseInt(scan.nextLine());
        int group1Count = 0;
        int group2Count = 0;
        int group3Count = 0;
        double sumFood = 0.0;
        for (int i = 1; i <= catCount; i++) {
            double gramsPerCat = Double.parseDouble(scan.nextLine());
            if (gramsPerCat >= 100 && gramsPerCat < 200) {
                group1Count++;
            } else if (gramsPerCat >= 200 && gramsPerCat < 300) {
                group2Count++;
            } else {
                group3Count++;
            }
            sumFood += gramsPerCat;
        }
        double foodInKg = sumFood / 1000;
        double priceForFood = foodInKg * 12.45;

        System.out.printf("Group 1: %d cats.%n",group1Count);
        System.out.printf("Group 2: %d cats.%n",group2Count);
        System.out.printf("Group 3: %d cats.%n",group3Count);
        System.out.printf("Price for food per day: %.2f lv.",priceForFood);
    }
}

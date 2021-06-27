package ProgrammingBasicsExamApril2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eggsCount = Integer.parseInt(scan.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int blueCount = 0;
        int greenCount = 0;

        int max = Integer.MIN_VALUE;
        String maxEggs = "";
        for (int i = 1; i <= eggsCount; i++) {
            String currentEgg = scan.nextLine();
            switch (currentEgg) {
                case "red":
                    redCount++;
                    break;
                case "orange":
                    orangeCount++;
                    break;
                case "blue":
                    blueCount++;
                    break;
                case "green":
                    greenCount++;
                    break;
            }
            if (redCount > max) {
                max = redCount;
                maxEggs = "red";
            }
            if (orangeCount > max) {
                max = orangeCount;
                maxEggs = "orange";
            }
            if (blueCount > max) {
                max = blueCount;
                maxEggs = "blue";
            }
            if (greenCount > max) {
                max = greenCount;
                maxEggs = "green";
            }
        }
        System.out.printf("Red eggs: %d\n", redCount);
        System.out.printf("Orange eggs: %d\n", orangeCount);
        System.out.printf("Blue eggs: %d\n", blueCount);
        System.out.printf("Green eggs: %d\n", greenCount);
        System.out.printf("Max eggs: %d -> %s", max, maxEggs);
    }
}

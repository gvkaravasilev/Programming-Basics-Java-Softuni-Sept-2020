package AdvancedConditionsLab;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String projectionType = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double income = 0.0;
        if("Premiere".equals(projectionType)){
            income = rows * columns * 12;
        }
        else if("Normal".equals(projectionType)){
            income = rows * columns * 7.50;
        }
        else if("Discount".equals(projectionType)){
            income = rows * columns * 5;
        }
        System.out.printf("%.2f leva",income);
    }
}

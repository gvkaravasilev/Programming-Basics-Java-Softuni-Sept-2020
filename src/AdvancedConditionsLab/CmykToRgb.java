package AdvancedConditionsLab;

import java.util.Scanner;

public class CmykToRgb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for CMYK in range 0 to 255");
        double R,G,B;
        double C = Double.parseDouble(scan.nextLine());
        double M = Double.parseDouble(scan.nextLine());
        double Y = Double.parseDouble(scan.nextLine());
        double K = Double.parseDouble(scan.nextLine());
        R = 255 * (1 - C /100) * (1 - K /100);
        G = 255 * (1 - M/100) * (1 - K/100);
        B = 255 * (1 - Y/100) * (1 - K/100);
        System.out.println(R+" "+G+" "+ B);
    }
}

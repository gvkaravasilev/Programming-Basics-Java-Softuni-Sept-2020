package AdvancedConditionsStatements;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine().toLowerCase();
        String city = scan.nextLine().toLowerCase();
        double amount = Double.parseDouble(scan.nextLine());
        double price = 0.0d;
        if("Sofia".equals(city)){
            if("coffee".equals(product)){
                price = 0.50d;
            }
            else if("water".equals(product)){
                price = 0.80d;
            }
            else if("beer".equals(product)){
                price = 1.20;
            }
            else if("sweets".equals(product))
                price = 1.45;
            else if("peanuts".equals(product)){
                price = 1.60;
            }
        }
        else if("Plovdiv".equals(city)){
            if("coffee".equals(product))
                price = 0.40;
            else if("water".equals(product)){
                price = 0.70;
            }
            else if("beer".equals(product)){
                price = 1.15;
            }
            else if("sweets".equals(product)){
                price = 1.30;
            }
            else if("peanuts".equals(product)){
                price = 1.50;
            }
        }
        else if("Varna".equals(city)) {
            if ("coffee".equals(product)) {
                price = 0.45;
            } else if ("water".equals(product)) {
                price = 0.70;
            } else if ("beer".equals(product)) {
                price = 1.10;
            } else if ("sweets".equals(product)) {
                price = 1.35;
            } else if ("peanuts".equals(product)) {
                price = 1.55;
            }
        }
        System.out.printf("%.2f",amount*price);
    }
}

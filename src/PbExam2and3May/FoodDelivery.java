package PbExam2and3May;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chickenMenusCount= Integer.parseInt(scan.nextLine());
        int fishMenusCount = Integer.parseInt(scan.nextLine());
        int vegMenusCount = Integer.parseInt(scan.nextLine());
        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegMenuPrice = 8.15;
        double totalChickenPrice = chickenMenusCount*chickenMenuPrice;
        double totalFishPrice = fishMenusCount * fishMenuPrice;
        double totalVegPrice = vegMenusCount* vegMenuPrice;
        double totalPrice = totalChickenPrice + totalFishPrice + totalVegPrice;
        double dessertPrice = totalPrice * 0.20;
        double deliveryPrice = 2.50;
        totalPrice += deliveryPrice + dessertPrice;
        System.out.printf("%.2f",totalPrice);



    }
}

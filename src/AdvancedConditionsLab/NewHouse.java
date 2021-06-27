package AdvancedConditionsLab;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String flowerType = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        double budget = Double.parseDouble(scan.nextLine());
        double discount = 0.0;
        double pricePerFlower = 0.0;
        double totalPrice = 0.0;
        double finalPrice = 0.0;
        if("Roses".equals(flowerType)){
            pricePerFlower = 5;
            if(flowersCount>80){
                discount = totalPrice *0.10;
            }
        }
        else if("Dahlias".equals(flowerType)){
            pricePerFlower = 3.80;
            if(flowersCount>90){
                discount = totalPrice * 0.15;
            }
        }
        else if("Tulips".equals(flowerType)){
            pricePerFlower = 2.80;
            if(flowersCount>80){
                discount = totalPrice * 0.15;
            }
        }
        else if("Narcissus".equals(flowerType)){
            pricePerFlower = 3;
            if(flowersCount<120){
                totalPrice = totalPrice + totalPrice * 0.15;
            }
        }
        else if("Gladiolus".equals(flowerType)){
            pricePerFlower = 2.50;
            if(flowersCount<80){
                totalPrice = totalPrice + totalPrice * 0.20;
            }
        }
        finalPrice = totalPrice - discount;
        double moneyLeft = budget - totalPrice;
        double moneyNeeded = totalPrice - budget;
        if(moneyLeft>moneyNeeded){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left. ", flowersCount,flowerType,moneyLeft);
        }
        else{
            System.out.printf("Not enough money, you need %.2f leva more.",moneyNeeded);
        }
    }
}

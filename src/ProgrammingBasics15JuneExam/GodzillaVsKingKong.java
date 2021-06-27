package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class GodzillaVsKingKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statistCount = Integer.parseInt(scan.nextLine());
        double pricePerStatist = Double.parseDouble(scan.nextLine());

        double decorPrice = budget * 0.10;
        double totalClothingPrice = statistCount * pricePerStatist;
        if(statistCount > 150){
            totalClothingPrice = totalClothingPrice * 0.90;
        }
        double totalPrice = decorPrice + totalClothingPrice;
        if(budget >= totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - totalPrice);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalPrice - budget);
        }

    }
}

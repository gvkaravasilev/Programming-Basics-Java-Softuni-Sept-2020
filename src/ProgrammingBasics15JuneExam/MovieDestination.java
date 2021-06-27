package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        double pricePerDay = 0.0;

        switch (destination){
            case "Dubai":
                if(season.equals("Winter")){
                    pricePerDay = 45000;
                }else if(season.equals("Summer")){
                    pricePerDay = 40000;
                }
                break;
            case "Sofia":
                if(season.equals("Winter")){
                    pricePerDay = 17000;
                }else if(season.equals("Summer")){
                    pricePerDay = 12500;
                }
                break;
            case "London":
                if(season.equals("Winter")){
                    pricePerDay = 24000;
                }else if(season.equals("Summer")){
                    pricePerDay = 20250;
                }
                break;
        }
        double totalPrice = pricePerDay * days;
        if(destination.equals("Dubai")){
            totalPrice = totalPrice * 0.70;
        }else if(destination.equals("Sofia")){
            totalPrice = totalPrice * 1.25;
        }
        if(budget >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget - totalPrice);
        }else{
            System.out.printf("The director needs %.2f leva more!",totalPrice - budget);
        }

    }
}

package ProgrammingBasicsExamApril2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guestsCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());
        double breadNeeded = Math.ceil(guestsCount / 3.0);
        int eggNeeded = guestsCount * 2;
        double breadPrice = breadNeeded * 4;
        double eggPrice = eggNeeded * 0.45;
        double totalPrice = breadPrice + eggPrice;
        if (budget >= totalPrice) {
            //"Lyubo bought {брои закупени козунаци} Easter bread and {брои закупени яйца} eggs."
            //"He has {останали пари} lv. left."
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n",breadNeeded,eggNeeded);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        }else{
            //"Lyubo doesn't have enough money."
            //"He needs {недостигащи пари} lv. more."
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv more.", totalPrice - budget);
        }
    }

}

package PbExam2and3May;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int litersNeeded = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();
        double gasPrice = litersNeeded * 2.10;
        double leaderPrice = 100;
        double totalPrice = gasPrice + leaderPrice;
        if(day.equals("Saturday")){
            totalPrice = totalPrice * 0.90;
        }else if(day.equals("Sunday")){
            totalPrice = totalPrice * 0.80;
        }
        if(budget >= totalPrice){
            System.out.printf("Safari time! Money left: %.2f lv.",budget - totalPrice);
        }else{
            System.out.printf("Not enough money! Money needed: %.2f lv.",totalPrice - budget);
        }
    }
}

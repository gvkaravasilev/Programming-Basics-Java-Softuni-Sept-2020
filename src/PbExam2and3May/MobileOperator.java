package PbExam2and3May;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String deadLine = scan.nextLine();
        String contractType = scan.nextLine();
        String internetAdded = scan.nextLine();
        int months = Integer.parseInt(scan.nextLine());
        double monthlyPrice = 0.0;
        switch (contractType){
            case "Small":
                if(deadLine.equals("one")){
                    monthlyPrice = 9.98;
                }else if(deadLine.equals("two")){
                    monthlyPrice = 8.58;
            }
                break;
            case "Middle":
                if(deadLine.equals("one")){
                    monthlyPrice = 18.99 ;
                }else if(deadLine.equals("two")){
                    monthlyPrice = 17.09;
                }
                break;
            case "Large":
                if(deadLine.equals("one")){
                    monthlyPrice = 25.98;
                }else if(deadLine.equals("two")){
                    monthlyPrice = 23.59;
                }
                break;
            case "ExtraLarge":
                if(deadLine.equals("one")){
                    monthlyPrice = 35.99;
                }else if(deadLine.equals("two")){
                    monthlyPrice = 31.79;
                }
                break;
        }
        if(internetAdded.equals("yes") && monthlyPrice <= 10){
            monthlyPrice = monthlyPrice + 5.50;
        }else if(internetAdded.equals("yes") && monthlyPrice <= 30){
            monthlyPrice = monthlyPrice + 4.35;
        }else if(internetAdded.equals("yes") && monthlyPrice > 30){
            monthlyPrice = monthlyPrice + 3.85;
        }
        double totalPrice = monthlyPrice * months;
        if(deadLine.equals("two")){
            totalPrice = totalPrice * 0.9625;
        }
        System.out.printf("%.2f",totalPrice);
    }
}


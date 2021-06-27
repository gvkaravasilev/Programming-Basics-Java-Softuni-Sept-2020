package AdvancedConditionsStatements;

import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commission = 0;
        if("Sofia".equals(city)){
            if(sales>0 && sales<=500){
                commission = sales*0.05;
            }
            else if(sales>500 && sales<=1000){
                commission = sales*0.07;
            }
            else if(sales>1000 && sales<=10000){
                commission = sales*0.08;
            }
            else if(sales>10000){
                commission = sales*0.12;
            }
        }
        else if("Varna".equals(city)){
            if(sales>0 && sales<=500){
                commission = sales*0.045;
            }
            else if(sales>500 && sales<=1000){
                commission = sales*0.075;
            }
            else if(sales>1000 && sales<=10000){
                commission = sales*0.10;
            }
            else if(sales>10000){
                commission = sales*0.13;
            }
        }
        else if("Plovdiv".equals(city)){
            if(sales>0 && sales<=500){
                commission = sales*0.055;
            }
            else if(sales>500 && sales<=1000){
                commission = sales*0.08;
            }
            else if(sales>1000 && sales<=10000){
                commission = sales*0.12;
            }
            else if(sales>10000){
                commission = sales*0.145;
            }
        }
        if(commission>0){
            System.out.printf("%.2f",commission);
        }
        else{
            System.out.println("error");
        }
    }
}

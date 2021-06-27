package ForLoopsLab;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double priceWM = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        double money = 10;
        double savedMoney = 0;
        int toysCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney +=money;
                money +=10;
                savedMoney -=1;

            } else {
                toysCount++;
            }

        }
        savedMoney += toyPrice*toysCount;
        if(savedMoney >= priceWM){
            System.out.printf("Yes! %.2f",savedMoney-priceWM);
        }else{
            System.out.printf("No! %.2f", priceWM-savedMoney);
        }



    }
}

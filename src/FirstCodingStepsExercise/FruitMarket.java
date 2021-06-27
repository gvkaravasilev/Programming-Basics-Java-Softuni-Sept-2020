package FirstCodingStepsExercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberryPrice=Double.parseDouble(scan.nextLine());
        double bananasCount=Double.parseDouble(scan.nextLine());
        double orangesCount=Double.parseDouble(scan.nextLine());
        double raspberriesCount=Double.parseDouble(scan.nextLine());
        double strawberriesCount=Double.parseDouble(scan.nextLine());
        double raspberriesPrice=strawberryPrice/2;
        double orangesPrice=raspberriesPrice-(raspberriesPrice*0.40);
        double bananasPrice=raspberriesPrice-(raspberriesPrice*0.8);
        double raspberriesTotalPrice=raspberriesCount*raspberriesPrice;
        double orangesTotalPrice=orangesCount*orangesPrice;
        double bananasTotalPrice=bananasCount*bananasPrice;
        double strawberriesTotalPrice=strawberriesCount*strawberryPrice;
        double totalSum=raspberriesTotalPrice+orangesTotalPrice+bananasTotalPrice+strawberriesTotalPrice;
        System.out.printf("%.2f",totalSum);







    }
}

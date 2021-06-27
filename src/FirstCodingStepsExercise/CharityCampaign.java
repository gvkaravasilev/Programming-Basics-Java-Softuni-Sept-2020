package FirstCodingStepsExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysCount=Integer.parseInt(scan.nextLine());
        int bakersCount=Integer.parseInt(scan.nextLine());
        int cakesCount=Integer.parseInt(scan.nextLine());
        int wafflesCount=Integer.parseInt(scan.nextLine());
        int pancakesCount=Integer.parseInt(scan.nextLine());
        double cakePrice=45.0;
        double wafflePrice=5.80;
        double pancakePrice=3.20;
        double dailyCakePrice=cakesCount*cakePrice;
        double dailyWafflePrice=wafflesCount*wafflePrice;
        double dailyPancakePrice=pancakesCount*pancakePrice;
        double totalBakersPricePerDay=(dailyCakePrice+dailyWafflePrice+dailyPancakePrice)*bakersCount;
        double totalPrice=totalBakersPricePerDay*daysCount;
        double sumAfterExpenses=totalPrice-(totalPrice/8);
        System.out.printf("%.2f",sumAfterExpenses);

    }
}

package FirstCodingStepsExercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rent=Integer.parseInt(scan.nextLine());
        double cakePrice=rent*0.20;
        double beveragePrice=cakePrice*0.55;
        double animatorPrice=rent/3.0;
        double totalPrice=rent+cakePrice+beveragePrice+animatorPrice;
        System.out.printf("%.1f",totalPrice);

    }
}

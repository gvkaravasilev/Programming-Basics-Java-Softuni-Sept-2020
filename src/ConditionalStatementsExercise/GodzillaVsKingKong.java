import java.util.Scanner;

public class GodzillaVsKingKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scan.nextLine());
        int statistCount = Integer.parseInt(scan.nextLine());
        double priceForClothingPerStatist = Double.parseDouble(scan.nextLine());
        double decorPrice = filmBudget * 0.1;
        double totalClothingPrice = statistCount * priceForClothingPerStatist;
        if(statistCount > 150){
            totalClothingPrice = totalClothingPrice * 0.9;
        }
         double filmPrice = decorPrice + totalClothingPrice;
        if (filmBudget > filmPrice) {
            double moneyLeft = filmBudget - filmPrice;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
        else{
            double moneyNeeded = filmPrice - filmBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded );
        }
    }

}

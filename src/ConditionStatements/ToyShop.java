import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scan.nextLine());
        int puzzleCount=Integer.parseInt(scan.nextLine());
        int dollsCount=Integer.parseInt(scan.nextLine());
        int teddyBearsCount=Integer.parseInt(scan.nextLine());
        int minionsCount=Integer.parseInt(scan.nextLine());
        int lorryCount=Integer.parseInt(scan.nextLine());
        double puzzlePrice=2.60;
        double dollPrice=3.0;
        double teddyBearPrice=4.10;
        double minionPrice=8.20;
        double lorryPrice=2.0;
        int totalCount=puzzleCount+dollsCount+teddyBearsCount+minionsCount+lorryCount;
        double totalPrice=puzzleCount*puzzlePrice+dollsCount*dollPrice+teddyBearsCount*teddyBearPrice+minionsCount*minionPrice+lorryCount*lorryPrice;
        if(totalCount>=50){
           totalPrice=totalPrice*0.75;
        }
        totalPrice=totalPrice*0.90;
        if(excursionPrice <= totalPrice){
            System.out.printf("Yes! %.2f lv left.",totalPrice-excursionPrice);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.", excursionPrice-totalPrice);

        }

    }
}

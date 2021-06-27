package ProgrammingBasicsExamApril2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double flourPrice = Double.parseDouble(scan.nextLine());
        double flourKg = Double.parseDouble(scan.nextLine());
        double sugarKg = Double.parseDouble(scan.nextLine());
        int kori = Integer.parseInt(scan.nextLine());
        int maia = Integer.parseInt(scan.nextLine());
        double sugarPrice = flourPrice * 0.75;
        double eggPrice = flourPrice * 1.1;
        double maiaPrice = sugarPrice * 0.2;
        double totalFlour = flourKg * flourPrice;
        double totalSugar = sugarKg * sugarPrice;
        double totalEgg = eggPrice * kori;
        double totalMaia = maia * maiaPrice;
        double totalPrice = totalFlour + totalSugar + totalEgg + totalMaia;
        System.out.printf("%.2f",totalPrice);

    }
}

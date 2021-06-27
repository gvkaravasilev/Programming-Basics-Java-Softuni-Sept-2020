package ForLoopsLab;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pagePricePerPiece = Double.parseDouble(scan.nextLine());
        double koricaPricePerPiece = Double.parseDouble(scan.nextLine());
        int percentageForPrint = Integer.parseInt(scan.nextLine());
        double designerPrice = Double.parseDouble(scan.nextLine());
        int percentageForTeam = Integer.parseInt(scan.nextLine());

        double initialSum = pagePricePerPiece * 899 + koricaPricePerPiece * 2;
        double sumAfterDiscount = initialSum - (initialSum * percentageForPrint/100);
        double sumWithDesigner = sumAfterDiscount + designerPrice;
        double teamExpenses = sumWithDesigner - (sumWithDesigner * percentageForTeam/100);
        System.out.printf("Avtonom should pay %.2f BGN.",teamExpenses);
        //initialSum = initialSum * (1 - percentageForPrint/100);
    }
}

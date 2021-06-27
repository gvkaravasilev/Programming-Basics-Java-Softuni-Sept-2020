package FirstCodingStepsExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposit=Double.parseDouble(scan.nextLine());
        int depositTerm=Integer.parseInt(scan.nextLine());
        double interestPercentage=Double.parseDouble(scan.nextLine());
        double interestPerYear= deposit*(interestPercentage/100);
        double interestPerMonth=interestPerYear/12;
        double totalSum=deposit+depositTerm*interestPerMonth;
        System.out.printf("%.2f",totalSum);


    }
}

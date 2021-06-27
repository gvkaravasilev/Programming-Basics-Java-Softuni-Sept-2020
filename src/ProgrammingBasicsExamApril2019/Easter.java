package ProgrammingBasicsExamApril2019;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kozCount = Integer.parseInt(scan.nextLine());
        int koriCount = Integer.parseInt(scan.nextLine());
        int kurabii = Integer.parseInt(scan.nextLine());
        double kozunakPrice = kozCount * 3.20;
        double eggPrice = koriCount * 4.35;
        double kurabiiPrice = kurabii * 5.40;
        double paintPrice = koriCount * 12 * 0.15;
        double totalPrice = kozunakPrice + eggPrice + kurabiiPrice + paintPrice;
        System.out.printf("%.2f",totalPrice);

    }
}

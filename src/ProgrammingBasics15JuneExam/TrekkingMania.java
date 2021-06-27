package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scan.nextLine());
        double sumMusalla = 0.0;
        double sumMonblan = 0.0;
        double sumKilimandjaro = 0.0;
        double sumK2 = 0.0;
        double sumEverest = 0.0;
        double totalPeople = 0.0;
        for (int i = 1; i <= groupsCount; i++) {
            int peopleCount = Integer.parseInt(scan.nextLine());
            if (peopleCount <= 5) {
                sumMusalla += peopleCount;
            } else if (peopleCount >= 6 && peopleCount <= 12) {
                sumMonblan += peopleCount;
            } else if (peopleCount >= 13 && peopleCount <= 25) {
                sumKilimandjaro += peopleCount;
            } else if (peopleCount >= 26 && peopleCount <= 40) {
                sumK2 += peopleCount;
            } else {
                sumEverest += peopleCount;
            }
            totalPeople += peopleCount;
        }
        System.out.printf("%.2f%%%n", sumMusalla / totalPeople * 100);
        System.out.printf("%.2f%%%n", sumMonblan / totalPeople * 100);
        System.out.printf("%.2f%%%n", sumKilimandjaro / totalPeople * 100);
        System.out.printf("%.2f%%%n", sumK2 / totalPeople * 100);
        System.out.printf("%.2f%%", sumEverest / totalPeople * 100);
    }
}

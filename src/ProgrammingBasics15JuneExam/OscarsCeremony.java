package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rent = Integer.parseInt(scan.nextLine());
        double statuetesPrice = rent - rent * 0.30;
        double foodPrice =statuetesPrice -  statuetesPrice * 0.15;
        double sound = foodPrice / 2.0;

        double totalPrice = rent + statuetesPrice + foodPrice + sound;
        System.out.printf("%.2f",totalPrice);
    }
}

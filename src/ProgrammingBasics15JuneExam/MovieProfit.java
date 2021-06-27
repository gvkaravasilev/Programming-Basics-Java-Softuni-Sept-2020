package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieName = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());
        int ticketsCount = Integer.parseInt(scan.nextLine());
        double ticketPrice = Double.parseDouble(scan.nextLine());
        int cinemaPercent = Integer.parseInt(scan.nextLine());
        double ticketsPricePerDay = ticketsCount * ticketPrice;
        double totalPrice = days * ticketsPricePerDay;
        double cinemaIncomes = totalPrice * cinemaPercent / 100;
        double movieIncome = totalPrice - cinemaIncomes;
        System.out.printf("The profit from the movie %s is %.2f lv.",movieName,movieIncome);
    }
}

package ProgrammingBasicsExamApril2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String country = scan.nextLine();
        String date = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double price = 0.0;
        if (country.equals("France")) {
            if (date.equals("21-23")) {
                price = 30;
            } else if (date.equals("24-27")) {
                price = 35;
            } else if (date.equals("28-31")) {
                price = 40;
            }
        }
        else if (country.equals("Italy")) {
            if (date.equals("21-23")) {
                price = 28;
            } else if (date.equals("24-27")) {
                price = 32;
            } else if (date.equals("28-31")) {
                price = 39;
            }
        }
        else if (country.equals("Germany")) {
            if (date.equals("21-23")) {
                price = 32;
            } else if (date.equals("24-27")) {
                price = 37;
            } else if (date.equals("28-31")) {
                price = 43;
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.", country, price * nights);

    }
}


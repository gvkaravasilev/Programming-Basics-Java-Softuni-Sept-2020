package ForLoopsLab;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int hoursSpent = Integer.parseInt(scan.nextLine());
        int peoplePerGroup = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        double pricePerPersonPerHour = 0.0;

        switch (month){
            case "march":
            case "april":
            case "may":
                if("day".equals(time)){
                    pricePerPersonPerHour = 10.50;
                }else if("night".equals(time)){
                    pricePerPersonPerHour = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if("day".equals(time)){
                    pricePerPersonPerHour = 12.60;
                }else if("night".equals(time)){
                    pricePerPersonPerHour = 10.20;
                }
                break;
        }
        if(peoplePerGroup >= 4){
            pricePerPersonPerHour = pricePerPersonPerHour * 0.90;
        }
        if(hoursSpent >= 5){
            pricePerPersonPerHour = pricePerPersonPerHour * 0.50;
        }
        double totalPrice = pricePerPersonPerHour * peoplePerGroup * hoursSpent;
        //"Price per person for one hour: {цена на човек за час}"
        //"Total cost of the visit: {общата цена}"
        System.out.printf("Price per person for one hour: %.2f%n",pricePerPersonPerHour);
        System.out.printf("Total cost of the visit: %.2f",totalPrice);

    }
}

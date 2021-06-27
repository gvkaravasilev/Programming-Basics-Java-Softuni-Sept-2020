package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double account = 0.0;
        String input = scan.nextLine();
        while (!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            account = account + amount;
            System.out.printf("Increase %.2f%n",amount);
            input = scan.nextLine();

        }
        System.out.printf("Total : %.2f",account);
    }
}


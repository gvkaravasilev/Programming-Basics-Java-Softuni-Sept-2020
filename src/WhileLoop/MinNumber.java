package WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int minNumber = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int currentNumber = Integer.parseInt(input);
            input = scan.nextLine();
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println(minNumber);

    }
}

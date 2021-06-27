package WhileLoop;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int initialNumber = Integer.parseInt(scan.nextLine());
        int sum = 0;
        while (sum <  initialNumber) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}

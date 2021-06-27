package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > maxNum) {
                maxNum = number;
            }
        }
        sum -= maxNum;
        if (sum == maxNum) {
            System.out.printf("Yes\nSum = %d", sum);
        } else {
            System.out.printf("No\nDiff = %d",Math.abs(sum - maxNum));
        }


    }
}

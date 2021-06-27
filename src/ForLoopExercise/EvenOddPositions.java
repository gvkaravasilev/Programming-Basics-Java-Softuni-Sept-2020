package ForLoopExercise;

import java.util.Scanner;

public class EvenOddPositions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double evenSum = 0;
        double evenMin = 1000000000;
        double evenMax = -1000000000;
        double oddSum = 0;
        double oddMin = 1000000000;
        double oddMax = -1000000000;
        boolean isEvenMax = false;
        boolean isEvenMin = false;
        boolean isOddMax = false;
        boolean isOddMin = false;
        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                    isEvenMax = true;
                }
                if (number < evenMin) {
                    evenMin = number;
                    isEvenMin = true;
                }

            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                    isOddMax = true;
                }
                if (number < oddMin) {
                    oddMin = number;
                    isOddMin = true;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n", oddSum);
        if(isOddMin){
            System.out.printf("OddMin=%.2f,\n");
        }else {
            System.out.print("OddMin=No,\n");
        }
        if(isOddMax){
            System.out.printf("OddMax=%.2f,\n",oddMax);
        }else{
            System.out.print("OddMax=No,\n");
        }
        System.out.printf("EvenSum=%.2f,\n",evenSum);
        if(isEvenMin){
            System.out.printf("EvenMin=%.2f,\n",evenMin);
        }else{
            System.out.print("EvenMin=No,\n");
        }
        if(isEvenMax){
            System.out.printf("EvenMax=%.2f",evenMax);
        }else{
            System.out.print("EvenMax=No");
        }
    }

}






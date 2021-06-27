package ForLoopMoreExercises;

import java.util.Scanner;

public class BackInThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyInherited = Double.parseDouble(scan.nextLine());
        int yearToLive = Integer.parseInt(scan.nextLine());
        int age = 17;
        for (int i = 1800; i <= yearToLive; i++) {

            if (i % 2 == 0) {
                moneyInherited -= 12000;
            } else {
                age += 2;
                moneyInherited -= 12000 + (50 * age);
            }

        }
        if(moneyInherited>=0){
            //Yes! He will live a carefree life and will have {N} dollars left."
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",moneyInherited);
        }else{
            //"He will need {М} dollars to survive."
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(moneyInherited));
        }
    }
}

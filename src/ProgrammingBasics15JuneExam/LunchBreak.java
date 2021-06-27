package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String serialName = scan.nextLine();
        int episodeDuration = Integer.parseInt(scan.nextLine());
        int restDuration = Integer.parseInt(scan.nextLine());

        double lunchBreak = restDuration / 8.0;
        double restTime = restDuration / 4.0;
        double timeLeft =restDuration - lunchBreak - restTime;

        if(timeLeft >= episodeDuration){
            //"You have enough time to watch {име на сериал} and left with {останало време} minutes free time."
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName,Math.ceil(timeLeft-episodeDuration));
        }else{
            // "You don't have enough time to watch {име на сериал}, you need {нужно време} more minutes."
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,Math.ceil(episodeDuration - timeLeft));

        }

    }
}

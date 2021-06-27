import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scan.nextLine());

        double totalSeconds = distanceInMeters * timeInSecondsPerMeter;
        double delayTime = (distanceInMeters/15)*12.5;
        double finalSeconds = totalSeconds + delayTime;
        if(finalSeconds < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",finalSeconds);
        }
        else{
            double secondsNeeded = finalSeconds - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", secondsNeeded);
        }

    }






}

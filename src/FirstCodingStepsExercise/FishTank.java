package FirstCodingStepsExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length=Integer.parseInt(scan.nextLine());
        int width=Integer.parseInt(scan.nextLine());
        int height=Integer.parseInt(scan.nextLine());
        double percent=Double.parseDouble(scan.nextLine());
        double volume=length*width*height;
        double liters=volume*0.001;
        double percents=percent*0.01;
        double totalLiters=liters*(1-percents);
        System.out.printf("%.2f",totalLiters);
    }
}

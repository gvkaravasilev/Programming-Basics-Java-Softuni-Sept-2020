package FirstCodingStepsExercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bookPages=Integer.parseInt(scan.nextLine());
        int pagesPerHour=Integer.parseInt(scan.nextLine());
        int daysCount=Integer.parseInt(scan.nextLine());
        int timeForBook=bookPages/pagesPerHour;
        int timePerDay=timeForBook/daysCount;
        System.out.println(timePerDay);


    }
}

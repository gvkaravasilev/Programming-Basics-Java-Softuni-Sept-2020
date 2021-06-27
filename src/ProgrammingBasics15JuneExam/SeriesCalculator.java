package ProgrammingBasics15JuneExam;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String seriesName = scan.nextLine();
        int seasonsCount = Integer.parseInt(scan.nextLine());
        int episodesCount = Integer.parseInt(scan.nextLine());
        int timeWithoutAdd = Integer.parseInt(scan.nextLine());
        double addTime = timeWithoutAdd * 0.20;
        double timeWithAdds = timeWithoutAdd + addTime;
        double additionalTime = seasonsCount * 10;
        double totalTime = Math.floor(timeWithAdds * episodesCount * seasonsCount + additionalTime);
        //"Total time needed to watch the {име на сериал} series is {време} minutes."
        System.out.printf("Total time needed to watch %s series is %.0f minutes.",seriesName, totalTime);
    }
}

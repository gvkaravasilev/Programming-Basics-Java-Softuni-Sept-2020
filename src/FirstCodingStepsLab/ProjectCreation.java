package FirstCodingStepsLab;

import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name=scan.nextLine();
        int projectsCount=Integer.parseInt(scan.nextLine());
        int hours=projectsCount*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,hours,projectsCount);
    }
}


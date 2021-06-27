package ForLoopMoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentsCount = Integer.parseInt(scan.nextLine());
        int top = 0;
        int between4And5 = 0;
        int between3And4 = 0;
        int fail = 0;
        double markResult = 0;
        for (int i = 1; i <= studentsCount; i++) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade < 3) {
                fail++;
            } else if (grade < 4) {
                between3And4++;
            } else if (grade < 5) {
                between4And5++;
            } else {
                top++;
            }
            markResult += grade;
        }
        System.out.printf("Top students: %.2f%%\n", 1.0 * top / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", 1.0 * between4And5/studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",1.0 * between3And4/studentsCount * 100);
        System.out.printf("Fail: %.2f%%\n",1.0 * fail/studentsCount * 100);
        System.out.printf("Average: %.2f",markResult/studentsCount);
    }
}

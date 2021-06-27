package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scan.nextLine());
        int badGrades = 0;
        int gradesSum = 0;
        int gradesCounter = 0;
        String currentTask = "";
        String task = scan.nextLine();
        while (!task.equals("Enough")){
            int grade = Integer.parseInt(scan.nextLine());
            gradesSum += grade;
            gradesCounter++;
            if(grade <= 4){
                badGrades++;
                if(badGrades == badGradesLimit){
                    break;
                }
            }
            currentTask = task;
            task = scan.nextLine();
        }
        double average = 1.0*gradesSum/gradesCounter;
        if(badGrades == badGradesLimit){
            //"You need a break, {брой незадоволителни оценки} poor grades."
            System.out.printf("You need a break, %d poor grades.",badGrades);
        }else{
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n",gradesCounter);
            System.out.printf("Last problem: %s",currentTask);
            //"Average score: {средна оценка}"
            //"Number of problems: {броя на всички задачи}"
            //"Last problem: {името на последната задача}"
        }
    }
}

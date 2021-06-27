package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabsCount = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());
        boolean isLostSalary = false;
        for (int i = 0; i < tabsCount; i++) {
            String website = scan.nextLine();
            if (website.equals("Facebook")) {
                salary -= 150;
            } else if (website.equals("Instagram")) {
                salary -= 100;
            } else if (website.equals("Reddit")) {
                salary -= 50;
            }
            if(salary<=0){
                isLostSalary = true;
                break;
            }
        }
        if(isLostSalary){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);
        }



    }
}

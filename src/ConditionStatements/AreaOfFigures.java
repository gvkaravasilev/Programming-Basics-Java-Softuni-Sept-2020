import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figureType = scan.nextLine();
        double area=0.0;
        switch (figureType){
            case"square":
                double a=Double.parseDouble(scan.nextLine());
                area=a*a;
                break;
            case"rectangle":
                double SideA=Double.parseDouble(scan.nextLine());
                double SideB=Double.parseDouble(scan.nextLine());
                area=SideA*SideB;
                break;
            case"circle":
                double r=Double.parseDouble(scan.nextLine());
                area= Math.PI*r*r;
                break;
            case"triangle":
                double A=Double.parseDouble(scan.nextLine());
                double h=Double.parseDouble(scan.nextLine());
                area=(A*h)/2;
                break;

        }
        System.out.printf("%.3f",area);
    }
}

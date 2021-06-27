package FirstCodingStepsLab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double meters=Double.parseDouble(scan.nextLine());
        double pricePerMeter=7.61;
        double wholeYardPrice=meters*pricePerMeter;
        double discount=wholeYardPrice*0.18;
        double totalPrice=wholeYardPrice-discount;
        System.out.printf("The final price is: %.2f lv.",totalPrice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);


    }
}

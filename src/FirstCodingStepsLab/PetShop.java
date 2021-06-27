package FirstCodingStepsLab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogsCount = Integer.parseInt(scan.nextLine());
        int animalsLeftCount = Integer.parseInt(scan.nextLine());
        double foodForDogs=2.50*dogsCount;
        double foodForLeftAnimals=4*animalsLeftCount;
        double totalPrice =foodForDogs+foodForLeftAnimals;
        System.out.printf("%.1f lv.",totalPrice);


    }
}

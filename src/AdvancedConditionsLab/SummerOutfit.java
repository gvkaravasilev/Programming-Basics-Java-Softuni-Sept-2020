package AdvancedConditionsLab;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        String outfit = " ";
        String shoes = " ";
        if(degrees >= 10 && degrees <= 18){
            if("Morning".equals(dayTime)){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if("Afternoon".equals(dayTime)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if("Evening".equals(dayTime)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        else if(degrees>18 && degrees<=24){
            if("Morning".equals(dayTime)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if("Afternoon".equals(dayTime)){
                outfit = "T-shirt";
                shoes = "Sandals";
            }
            else if("Evening".equals(dayTime)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        else if(degrees >=25){
            if("Morning".equals(dayTime)){
                outfit = "T-shirt";
                shoes = "Sandals";
            }
            else if("Afternoon".equals(dayTime)){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
            else if("Evening".equals(dayTime)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s",degrees,outfit,shoes);
    }
}

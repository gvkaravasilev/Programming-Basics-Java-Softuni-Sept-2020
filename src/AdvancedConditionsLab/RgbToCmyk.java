package AdvancedConditionsLab;

import java.util.Scanner;

public class RgbToCmyk{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for red, green and blue in range 0 to 255");
        double red = Double.parseDouble(scan.nextLine());
        double green = Double.parseDouble(scan.nextLine());
        double blue = Double.parseDouble(scan.nextLine());
        double cyan,magenta,yellow,black;
        double white = 0;
        double max;
        if(red == 0 && green == 0 && blue == 0){
            cyan = magenta = yellow = 0;
            black = 1;
        }
        else{
            red = red/255;
            green = green/255;
            blue = blue/255;
            max = red;
            if(green>max){
                max = green;
            }
            else if(blue>max){
                max = blue;
            }
            cyan = (white-red)/white;
            magenta = (white-green)/white;
            yellow = (white-blue)/white;

            black = 1- white;
            System.out.println("CMYK = ");
            System.out.println(cyan);
            System.out.println(magenta);
            System.out.println(yellow);
            System.out.println(black);


        }

    }
}
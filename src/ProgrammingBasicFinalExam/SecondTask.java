package ForLoopsLab;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double averageSizeOfAstronauts = Double.parseDouble(scan.nextLine());

        double volume = width * length * height;
        double singleRoomSpace = ( averageSizeOfAstronauts + 0.40) * 2 * 2;

        double astronauts = Math.floor(volume/singleRoomSpace);
        if(astronauts >= 3 && astronauts <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.",astronauts);
        }else if(astronauts < 3){
            System.out.println("The spacecraft is too small.");
        }else{
            System.out.println("The spacecraft is too big.");
        }

    }
}

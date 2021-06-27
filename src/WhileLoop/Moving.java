package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        int volume = width * length * height;
        while(volume > 0){
            String input = scan.nextLine();
            if(input.equals("Done")){
                break;
            }
            int boxes = Integer.parseInt(input);
            volume -= boxes;
        }
        if(volume >= 0){
            System.out.printf("%d Cubic meters left.",volume);
        }else{
            //No more free space! You need 2 Cubic meters more.
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(volume));
        }
    }
}

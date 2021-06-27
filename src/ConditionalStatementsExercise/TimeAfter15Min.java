import java.util.Scanner;
public class TimeAfter15Min {

    public class TimeAndMinutes {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int startHour=Integer.parseInt(scan.nextLine());
            int startMinutes=Integer.parseInt(scan.nextLine());
            int timeInMinutes=startHour*60+startMinutes;
            int TimePlus15=timeInMinutes+15;
            int FinalHour=TimePlus15/60;
            int FinalMinutes=TimePlus15%60;
            if(FinalHour>=24){
                FinalHour=FinalHour-24;
            }
            if(FinalMinutes<10){
                System.out.printf("%d:0%d",FinalHour,FinalMinutes);

            }
            else{
                System.out.printf("%d:%d",FinalHour,FinalMinutes);
            }
        }
    }

}

package ForLoopMoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int period = Integer.parseInt(scan.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scan.nextLine());
            if (period % 3 == 0 && untreatedPatients > treatedPatients) {
                doctors++;
            }
            if (patients > doctors) {
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            } else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.\n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);

    }
}

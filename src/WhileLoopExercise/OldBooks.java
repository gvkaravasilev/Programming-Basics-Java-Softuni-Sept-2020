package WhileLoopExercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchedBook = scan.nextLine();
        String currentBook = scan.nextLine();
        int booksCounter = 0;
        boolean isFound = false;
        while (!currentBook.equals("No More Books")) {
            if (currentBook.equals(searchedBook)) {
                isFound = true;
                break;
            }
            booksCounter++;
            currentBook = scan.nextLine();
        }
        //"You checked {брой} books and found it."
        if(isFound){
            System.out.printf("You checked %d books and found it.",booksCounter);
        }else{
            //"The book you search is not here!"
            //"You checked {брой} books."
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.",booksCounter);
        }

    }
}

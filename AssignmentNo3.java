import java.util.Scanner;

public class AssignmentNo3 {

    public static void main(String[] args) {
        System.out.println("Please enter 10 grades! ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter grade: ");
            while (!input.hasNextByte()) {
                System.out.println("That`s not a number! Please enter number from 0 to 10!");
                input.next();
            }
            byte grade = input.nextByte();
            if ((grade <= 10 && grade >= 0)) {
                myArray[i] = grade;
            } else {
                i--;
                System.out.println("Please enter valid grade from 0 to 10!");
            }
        }
        System.out.println(studentsFailed() + " students failed (the grade is smaller than 4)");
        System.out.println(bestResult() + " students got an A level (the grade is 10)");
        histogram();
    }

    public static byte[] myArray = new byte[10];
    public static Scanner input = new Scanner(System.in);

    public static int studentsFailed() {
        int counter = 0;
        for (int i : myArray) {
            if (i < 4) {
                counter++;
            }
        }
        return counter;
    }
    public static int bestResult() {
        int bestResult = 0;
        for (int b : myArray) {
            if (b == 10) {
                bestResult++;
            }
        }
        return bestResult;
    }
    public static void histogram(){
        int[] countGrades = new int[11];
        int counter;
        for (int i = 0; i < countGrades.length; i++) {
            counter = 0;
            for (int j = 0; j < myArray.length; j++) {
                if (i == myArray[j]) {
                    counter++;
                }
            }
            countGrades[i] = counter;
        }
        for (int i = 0; i < countGrades.length; i++) {
            System.out.println(countGrades[i] + " students with grade" + i);
        }
    }

}

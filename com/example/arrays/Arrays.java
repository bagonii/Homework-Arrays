package com.example.arrays;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        assignmentNo_1();
        assignmentNo_2();
        assignmentNo_3();
    }
    public static void assignmentNo_1() {
        int[] myArray = {5, 3, 7, 6, 2, 8};
        System.out.println("FOR");
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
        System.out.println("FOR EACH");
        for (int tempVar : myArray)
            System.out.println(tempVar);
        System.out.println("WHILE");
        {
            int i = 0;
            while (i < myArray.length) {
                System.out.println(myArray[i]);
                i++;
            }
        }
        System.out.println("DO WHILE");
        {
            int i = 0;
            do {
                System.out.println(myArray[i]);
                i++;
            }
            while (i < myArray.length);
        }
        System.out.println("The best method for this Assignment is FOR EACH.");
    }

    public static void assignmentNo_2() {
        int[] newArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("negative numbers:");
        for (int i : newArray) {
            if (i < 0)
                System.out.println(i);
        }
        System.out.println("odd numbers:");
        for (int i : newArray) {
            if (i % 2 != 0)
                System.out.println(i);
        }
        System.out.println("how many odd numbers:");
        int odd = 0;
        for (int i : newArray) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println("multiple numbers with the same value are:");
        for (int i = 1; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] == newArray[j])
                    System.out.println(newArray[i]);
            }
        }
        System.out.println("print out each second number:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i + 1]);
            i++;
        }
        System.out.println("average value of the array:");
        double sum = 0;
        for (int a : newArray)
            sum += a;
        double average = sum / newArray.length;
        System.out.println(average);
        System.out.println("how many numbers are smaller than average value:");
        int belowAverage = 0;
        for (int b : newArray) {
            if (b < average) {
                belowAverage++;
            }
        }
        System.out.println(belowAverage);
    }

    public static void assignmentNo_3() {
        byte[] myArray = new byte[10];
        Scanner input = new Scanner(System.in);
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
        int studentsFailed = 0;
        for (int f : myArray) {
            if (f < 4) {
                studentsFailed++;
            }
        }
        System.out.println(studentsFailed + " students failed (the grade is smaller than 4)");
        int bestResult = 0;
        for (int b : myArray) {
            if (b == 10) {
                bestResult++;
            }
        }
        System.out.println(bestResult + " students got an A level (the grade is 10)");

        int [] countGrades = new int[11];
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
        for (int i = 0; i < countGrades.length; i++){
                System.out.println (countGrades [i] + " students with grade" + i);
            }
      }
}
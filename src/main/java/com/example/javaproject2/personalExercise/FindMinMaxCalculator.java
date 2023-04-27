package com.example.javaproject2.personalExercise;

import java.util.Scanner;

public class FindMinMaxCalculator {
    final static String lines = "==============================================\n";

    public static void main(String[] args) {

        System.out.printf("%sThis program calculates the minimum/maximum value of the numbers you enter. \n" +
                "Please enter the numbers separately with the space bar.\n%s", lines, lines);

        System.out.print("Enter Numbers --> ");
        findMaxNumber();


    }

    private static void findMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        String[] numbersFromString = scanner.nextLine().split(" ");
        System.out.println(numbersFromString.length);
        for (int i = 0; i < numbersFromString.length; i++) {
            minNumber = Math.min(minNumber, Integer.parseInt(numbersFromString[i]));
            maxNumber = Math.max(maxNumber, Integer.parseInt(numbersFromString[i]));
        }
        System.out.printf("Minimum Number is ... --> %d\n" +
                "Maximum Number is ... --> %d", minNumber, maxNumber);
    }
}

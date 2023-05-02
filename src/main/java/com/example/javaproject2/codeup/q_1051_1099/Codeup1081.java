package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diceNum1 = scanner.nextInt();
        int diceNum2 = scanner.nextInt();
        for (int j = 1; j <= diceNum1; j++) {
            for (int i = 1; i <= diceNum2; i++) {
                System.out.printf("%d %d\n", j, i);
            }
        }
    }
}

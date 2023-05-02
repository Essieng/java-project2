package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (i % 3 == 0) {
                System.out.printf("%s ", "X");
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}

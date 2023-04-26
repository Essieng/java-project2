package com.example.javaproject2.codeup.q_1001_1050;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.printf("%d\n", num1 + num2);
        System.out.printf("%d\n", num1 - num2);
        System.out.printf("%d\n", num1 * num2);
        System.out.printf("%d\n", num1 / num2);
        System.out.printf("%d\n", num1 % num2);
        System.out.printf("%.2f\n", (float) num1 / (float) num2);
    }
}

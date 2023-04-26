package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.printf("%d", (num1 > num2 ? num2 : num1) > num3 ? num3 : (num1 > num2 ? num2 : num1));
    }
}

package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("plus");
            if (num1 % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        else {
            System.out.println("minus");
            if (num1 % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
    }
}

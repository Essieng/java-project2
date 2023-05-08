package com.example.javaproject2.codeup.q_1251_1300;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < num * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

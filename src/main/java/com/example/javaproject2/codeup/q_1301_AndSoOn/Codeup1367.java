package com.example.javaproject2.codeup.q_1301_AndSoOn;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

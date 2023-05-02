package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int personA = scanner.nextInt();
        int personB = scanner.nextInt();
        int personC = scanner.nextInt();
        int days = 1;
        while (days % personA != 0 || days % personB != 0 || days % personC != 0) {
            days++;
        }
        System.out.println(days);
    }
}

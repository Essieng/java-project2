package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score>89) {
            System.out.println("A");
        } else if (score>=70) {
            System.out.println("B");
        } else if (score>=40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

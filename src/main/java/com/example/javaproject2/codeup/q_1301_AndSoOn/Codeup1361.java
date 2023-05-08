package com.example.javaproject2.codeup.q_1301_AndSoOn;

import java.util.Scanner;

public class Codeup1361 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stairNum = scanner.nextInt();
        for (int i = 0; i < stairNum; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("**");
        }
    }
}

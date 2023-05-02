package com.example.javaproject2.codeup.q_1051_1099;


import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stdNum = new int[10001];

        for (int i = 1; i <= n; i++) {
            stdNum[i] = scanner.nextInt();
        }

        for (int i = n; i > 0; i--) {
            System.out.printf("%d ", stdNum[i]);
        }
    }
}

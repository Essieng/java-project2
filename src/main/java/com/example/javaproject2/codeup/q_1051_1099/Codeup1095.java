package com.example.javaproject2.codeup.q_1051_1099;


import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stdNum = new int[10001];

        for (int i = 0; i < n; i++) {
            stdNum[i] = scanner.nextInt();
        }

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (minValue>stdNum[i]) {
                minValue = stdNum[i];
            }
        }
        System.out.printf("%d\n",minValue);
    }
}

package com.example.javaproject2.codeup.q_1051_1099;


import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stdNum = new int[24];

        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            stdNum[num]++;
        }

        for (int i = 1; i < stdNum.length; i++) {
            System.out.printf("%d ",stdNum[i]);
        }
    }
}

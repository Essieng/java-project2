package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long m = scanner.nextInt();
        long d = scanner.nextInt();
        long n = scanner.nextInt();

        long result = a;

        for (int i = 1; i<n; i++) {
            result *= m;
            result += d;
        }

        System.out.println(result);
    }
}

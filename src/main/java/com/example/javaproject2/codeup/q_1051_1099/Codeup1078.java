package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intNum1 = scanner.nextInt();
        int sum = 0;

        for (int i=0; i<=intNum1; i++) {
            if (i%2==0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

package com.example.javaproject2.codeup.q_1001_1050;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = num1+num2+num3;
        System.out.printf("%d\n",num1+num2+num3);
        System.out.printf("%.1f",(float)sum/3);
    }
}

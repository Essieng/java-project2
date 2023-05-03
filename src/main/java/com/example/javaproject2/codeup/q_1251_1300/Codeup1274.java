package com.example.javaproject2.codeup.q_1251_1300;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (count > 0) break;
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

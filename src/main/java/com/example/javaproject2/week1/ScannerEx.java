package com.example.javaproject2.week1;

import java.util.Scanner;

public class ScannerEx {
    public void plusTwoNumbers(int val1, int val2) {
        Scanner scanner = new Scanner(System.in);
        val1 = scanner.nextInt();
        val2 = scanner.nextInt();
        int sum = val1 + val2;
        System.out.println("val1+val2 = " + sum);

        //        System.out.println(scanner.nextInt() + scanner.nextInt());
    }
}

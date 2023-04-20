package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1/2 번째 숫자 입력: ");
        int num1 = scanner.nextInt();
        System.out.print("2/2 번째 숫자 입력: ");
        int num2 = scanner.nextInt();

        System.out.printf("\' %d \'와 \' %d \' 의 합은 \' %d \' 입니다.", num1, num2, num1 + num2);

    }
}

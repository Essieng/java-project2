package com.example.javaproject2.week3.day13;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소수 판별할 숫자 입력: ");
        int num = scanner.nextInt();
        int factors = 0;
        System.out.print("약수: ");
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                System.out.printf("%d ",i);
                factors++;
            }
        }
        System.out.println("\n"+"factors(약수의 개수) = " + factors + " 개");
        System.out.println(factors==0);
    }
}

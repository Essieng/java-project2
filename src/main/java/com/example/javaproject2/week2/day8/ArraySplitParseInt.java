package com.example.javaproject2.week2.day8;

import java.util.Scanner;

public class ArraySplitParseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.next().split(",");
        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);
        int num3 = Integer.parseInt(strArr[2]);
        System.out.printf("%d",num1+num2+num3);
    }
}

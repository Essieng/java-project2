package com.example.javaproject2.week2.day9;

public class ComparisonArray {
    public static void main(String[] args) {
        int intArr[] = {2, 1, 7, 9};
        System.out.printf("%d > %d = %b\n", intArr[0], intArr[1], intArr[0] > intArr[1]);
        System.out.printf("%d > %d = %b\n", intArr[1], intArr[2], intArr[1] > intArr[2]);
        System.out.printf("%d > %d = %b\n", intArr[2], intArr[3], intArr[2] > intArr[3]);
    }
}

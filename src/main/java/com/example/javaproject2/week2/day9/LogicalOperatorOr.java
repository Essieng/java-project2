package com.example.javaproject2.week2.day9;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        boolean result = true || true; // 결과값 true
        System.out.printf("현재 result 상태 : %b\n", result);
        result = true || false; // 결과값 true
        System.out.printf("현재 result 상태 : %b\n", result);
        result = false || true; // 결과값 true
        System.out.printf("현재 result 상태 : %b\n", result);
        result = false || false; // 결과값 false
        System.out.printf("현재 result 상태 : %b\n", result);
    }
}

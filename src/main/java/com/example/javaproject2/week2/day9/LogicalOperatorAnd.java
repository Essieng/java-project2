package com.example.javaproject2.week2.day9;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        boolean result = true && true; // 결과값 true
        System.out.printf("현재 result 상태 : %b\n", result);
        result = true && false;
        System.out.printf("현재 result 상태 : %b\n", result);
        result = false && true;
        System.out.printf("현재 result 상태 : %b\n", result);
        result = false && false;
        System.out.printf("현재 result 상태 : %b\n", result);
    }
}

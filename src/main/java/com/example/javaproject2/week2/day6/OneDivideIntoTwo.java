package com.example.javaproject2.week2.day6;

public class OneDivideIntoTwo {
    public static void main(String[] args) {

        // 1/2를 출력 -> 정수단위로 나눗셈을 인식하므로 소수점은 '버림'처리 한다
        System.out.println(1/2);

        // 1.0/2를 출력 -> 1이 1.0으로 작성되어 실수단위로 나눗셈을 인식, 소수점이 살아있다
        System.out.println(1.0/2);
    }
}

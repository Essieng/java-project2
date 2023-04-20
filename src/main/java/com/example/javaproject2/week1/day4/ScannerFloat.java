package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerFloat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 3개를 공백으로 구분하여 입력하세요\n입력: ");
        System.out.println("평균값: "+(scanner.nextFloat()+scanner.nextFloat()+scanner.nextFloat())/3);
    }
}

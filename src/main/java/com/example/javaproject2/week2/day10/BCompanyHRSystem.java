package com.example.javaproject2.week2.day10;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOfExp = scanner.nextInt();
        int numOfProj = scanner.nextInt();

        if (yearOfExp > 5 || numOfProj > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}

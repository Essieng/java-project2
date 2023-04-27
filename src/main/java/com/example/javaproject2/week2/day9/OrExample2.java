package com.example.javaproject2.week2.day9;

public class OrExample2 {
    public static void main(String[] args) {
        int yearOfExp = 8;
        int numOfProj = 12;

        boolean isPromotion = yearOfExp > 5 || numOfProj > 10;
        System.out.printf("팀장승진여부: %b\n", isPromotion);
    }
}

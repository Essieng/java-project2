package com.example.javaproject2.week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31; // 31세
        boolean isAdult = userAge >=18; // 18세 이상이면 성인
        System.out.printf("미성년자입니까? %b\n",!isAdult);
    }
}

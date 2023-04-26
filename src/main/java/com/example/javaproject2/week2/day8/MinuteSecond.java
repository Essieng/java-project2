package com.example.javaproject2.week2.day8;

public class MinuteSecond {
    public static void main(String[] args) {
        int second = 239;
        int minute = second / 60;
        int remainSecond = second % 60;
        System.out.printf("%d 분 %d 초", minute, remainSecond);
    }
}

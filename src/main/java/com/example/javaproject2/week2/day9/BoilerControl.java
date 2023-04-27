package com.example.javaproject2.week2.day9;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45; // 수온
        int roomTemperature = 22; // 실내 온도

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        // 수온이 50 보다 낮고, 실내 온도가 24 보다 낮은게 둘다 참이면 true,
        // 하나라도 거짓이면 false
        System.out.printf("check : %b\n", check);
    }
}

package com.example.javaproject2.week2.day10;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > 0 && y > 0) {
            System.out.println("X와 Y는 모두 양수입니다.");
        }

        if (x > 0 || y > 0) {
            System.out.println("X와 Y중 적어도 한 개는 양수입니다.");
        }

        if (!(x > 0)) {
            System.out.println("X는 음수 또는 0 입니다.");
        }
    }
}

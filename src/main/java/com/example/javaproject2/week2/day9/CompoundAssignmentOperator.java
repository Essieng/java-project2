package com.example.javaproject2.week2.day9;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 1;
        System.out.printf("+= 1 %d\n", x);
        x -= 5;
        System.out.printf("-= 1 %d\n", x);
        x *= 2;
        System.out.printf("*= 1 %d\n", x);
        x /= 3;
        System.out.printf("/= 1 %d\n", x);
        x %= 8;
        System.out.printf("%%= 1 %d\n", x);
    }
}

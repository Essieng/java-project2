package com.example.javaproject2.week3.day11;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j = 2; j<5;j++) {
            System.out.println("******"+j+"단"+"******");
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n", j, i, j * i);
            }
        }

    }
}

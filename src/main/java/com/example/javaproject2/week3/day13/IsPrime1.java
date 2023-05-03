package com.example.javaproject2.week3.day13;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 2; i <= num; i++) {
            if (num%i==0) {
                System.out.printf("%d ",i);
            }
        }
    }
}

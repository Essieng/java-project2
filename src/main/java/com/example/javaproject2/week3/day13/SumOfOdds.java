package com.example.javaproject2.week3.day13;

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2!=0) {
                answer += i;
            }
        }
        System.out.println("answer = " + answer);
    }
}

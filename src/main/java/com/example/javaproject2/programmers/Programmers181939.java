package com.example.javaproject2.programmers;

public class Programmers181939 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int answer;
        int answer2;
        answer = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        answer2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        if (answer > answer2) {
            System.out.println(answer);
        } else {
            System.out.println(answer2);
        }
    }
}

package com.example.javaproject2.programmers;

public class Programmers181935 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;

        if (n % 2 == 0) {
            System.out.println("n은 짝수");
            for (int i = 2; i <= n; i+=2) {
                    answer += Math.pow(i, 2);
            }
        } else {
            System.out.println("n은 홀수");
            for (int i = 1; i <= n; i+=2) {
                    answer += i;
            }
        }

        System.out.println("answer = " + answer);
    }
}

package com.example.javaproject2.week2.day9;

public class Accumulate687 {
    public static void main(String[] args) {
        //687의  각  자리수  합을  '누적'하는  방법을  이용해  구하는  코드

        int num = 687;
        int answer = 0;

        answer = answer + (num%10); // 7
        num = num/10; // 68
        System.out.printf("answer 누적: %d\n",answer);

        answer = answer + (num%10); // 8
        num = num/10; // 6
        System.out.printf("answer 누적: %d\n",answer);

        answer = answer + (num%10); // 8
        num = num/10; // 0
        System.out.printf("answer 누적: %d\n",answer);

    }
}

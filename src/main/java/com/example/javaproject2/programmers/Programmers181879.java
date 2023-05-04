package com.example.javaproject2.programmers;

public class Programmers181879 {
    public static void main(String[] args) {
        int[] num_list = {2,3,4,5};
        int answer = 0;
        System.out.println("num_list.length = " + num_list.length);
        if (num_list.length >= 11) {
            System.out.println("+=실행");
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            System.out.println("*=실행");
            answer = 1;
            for (int i = 0; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        System.out.println("answer = " + answer);
    }
}

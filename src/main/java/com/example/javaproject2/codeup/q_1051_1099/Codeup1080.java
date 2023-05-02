package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int insertNum = scanner.nextInt();
        int factorialNum = 1;
        int sum1 = 0;

        while (true) {
            sum1 += factorialNum;
            factorialNum++;
            if (sum1>=insertNum) {
                break;
            }
        }
        System.out.println(factorialNum-1);
    }
}

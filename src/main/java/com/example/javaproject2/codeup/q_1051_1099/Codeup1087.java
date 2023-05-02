package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int insertNum = scanner.nextInt();
        int sumNum = 0;
        int factorialNum = 1;
        while (true) {
            sumNum += factorialNum;
            if (sumNum>=insertNum) {
                break;
            }
            factorialNum++;
        }
        System.out.println(sumNum);
    }
}

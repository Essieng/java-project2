package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numArr = scanner.next().split("");

        for (int i = 0; i < numArr.length; i++) {
            System.out.printf("[%.0f]\n",Integer.parseInt(numArr[i])*Math.pow(10,numArr.length-(i+1)));
        }
    }
}

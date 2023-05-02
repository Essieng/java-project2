package com.example.javaproject2.codeup.q_1100_1150;

import java.util.Scanner;

public class Codeup1123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celTemp = scanner.nextInt();
        float celTempToFahrenheitTemp = (float)1.8*celTemp+32;
        System.out.printf("%.3f\n",celTempToFahrenheitTemp);
    }
}

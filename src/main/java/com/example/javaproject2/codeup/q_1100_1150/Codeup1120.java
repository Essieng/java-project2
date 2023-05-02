package com.example.javaproject2.codeup.q_1100_1150;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intVal1 = scanner.nextInt();
        int intVal2 = scanner.nextInt();
        int intVal3 = scanner.nextInt();
        float average = (float)(intVal1+intVal2+intVal3)/3;
        System.out.printf("%.2f\n",average);
    }
}

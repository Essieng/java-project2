package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(16);

        for (int i=1;i<16;i++) {
            System.out.printf("%X*%X=%X\n",a,i,a*i);
        }
    }
}

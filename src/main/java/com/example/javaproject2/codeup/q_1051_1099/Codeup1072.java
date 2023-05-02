package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nArr = new int[n];

        for (int i=0;i<n;i++) {
            nArr[i]=scanner.nextInt();
            System.out.println(nArr[i]);
        }
    }
}

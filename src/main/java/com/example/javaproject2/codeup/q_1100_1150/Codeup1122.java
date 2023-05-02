package com.example.javaproject2.codeup.q_1100_1150;

import java.util.Scanner;

public class Codeup1122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int secToMin = sec / 60;
        int secToSec = sec % 60;
        System.out.printf("%d %d\n", secToMin, secToSec);
    }
}

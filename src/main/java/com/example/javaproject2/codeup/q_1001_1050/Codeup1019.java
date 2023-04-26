package com.example.javaproject2.codeup.q_1001_1050;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.next().split("\\.");
        System.out.printf("%04d.%02d.%02d",
                Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
    }
}

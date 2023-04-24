package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr=scanner.next().split(":");
        System.out.printf("%d",Integer.parseInt(strArr[1]));
    }
}

package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long imageWidth = scanner.nextLong();
        long imageHeight = scanner.nextLong();
        long imageBit = scanner.nextLong();

        long fileSizeBit = imageWidth*imageHeight*imageBit;
        float bitToMegabyte = (float)fileSizeBit/8/1024/1024;

        System.out.printf("%.2f MB\n",bitToMegabyte);
    }
}

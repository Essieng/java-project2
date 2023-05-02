package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long soundHz = scanner.nextLong();
        long soundBit = scanner.nextLong();
        long soundChannel = scanner.nextLong();
        long soundTimeSec = scanner.nextLong();

        long fileSizeBit = soundHz*soundBit*soundChannel*soundTimeSec;
        float bitToMegabyte = (float)fileSizeBit/8/1024/1024;

        System.out.printf("%.1f MB\n",bitToMegabyte);
    }
}

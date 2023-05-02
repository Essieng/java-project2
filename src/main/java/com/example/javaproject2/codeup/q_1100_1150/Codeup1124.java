package com.example.javaproject2.codeup.q_1100_1150;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        scanner.close();

        str1 = str1.replace("C", "");

        String[] strArr = str1.split("H");
        int cNum = Integer.parseInt(strArr[0]);
        int hNum = Integer.parseInt(strArr[1]);

        System.out.printf("%d\n", 12 * cNum + hNum);
    }
}

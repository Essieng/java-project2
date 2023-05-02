package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int sequence = scanner.nextInt();
        int count = scanner.nextInt();
        int countCheck = 1;



        for (int i = startNum; ; i += sequence, countCheck++) {
            if (countCheck == count) {
                System.out.println(i);
                break;
            }
        }
    }
}

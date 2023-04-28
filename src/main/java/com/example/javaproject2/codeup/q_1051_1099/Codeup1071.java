package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numArr = scanner.nextLine().split(" ");

        printNumbers(numArr, 0);
    }

    public static void printNumbers(String[] numArr, int index) {
        if (index >= numArr.length || numArr[index].equals("0")) {
            return;
        }

        System.out.println(numArr[index]);
        printNumbers(numArr, index + 1);
    }
}

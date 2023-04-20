package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] wordToCharArr = new char[word.length()];

        for (int i=0;i< wordToCharArr.length;i++) {
            wordToCharArr[i] = word.charAt(i);
        }

        for (char c : wordToCharArr) {
            System.out.println("'" + c + "'");
        }
    }
}

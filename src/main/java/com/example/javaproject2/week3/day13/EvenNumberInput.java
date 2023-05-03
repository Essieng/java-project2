package com.example.javaproject2.week3.day13;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("숫자를 입력하세요: ");
            num = scanner.nextInt();
        } while (num % 2 != 0);
        System.out.println("올바른 짝수가 입력되었습니다.: " + num);
    }
}

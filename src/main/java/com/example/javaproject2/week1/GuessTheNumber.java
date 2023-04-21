package com.example.javaproject2.week1;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int numGuesses = 0;

        System.out.println("1부터 100까지의 숫자 중 하나를 선택했습니다. 맞춰보세요!");

        while (guess != number) {
            System.out.print("추측한 숫자를 입력하세요: ");
            guess = input.nextInt();
            numGuesses++;

            if (guess < number) {
                System.out.println("너무 작아요! 다시 시도해보세요.");
            } else if (guess > number) {
                System.out.println("너무 커요! 다시 시도해보세요.");
            } else {
                System.out.println("축하합니다! " + numGuesses + "번 만에 맞췄어요.");
            }
        }
    }
}


package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boardHeight, boardWidth;
        int numOfStick, lengthOfStick, directionOfStick, stickPositionX, stickPositionY;

        boardHeight = scanner.nextInt();
        boardWidth = scanner.nextInt();
        int[][] board = new int[boardHeight][boardWidth];


        numOfStick = scanner.nextInt();

        for (int i = 0; i < numOfStick; i++) {
            lengthOfStick = scanner.nextInt();
            directionOfStick = scanner.nextInt();
            stickPositionX = scanner.nextInt();
            stickPositionY = scanner.nextInt();
            for (int j = 0; j < lengthOfStick; j++) {
                if (directionOfStick == 0) {
                    board[stickPositionX - 1][stickPositionY - 1 + j] = 1;
                } else {
                    board[stickPositionX - 1 + j][stickPositionY - 1] = 1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}

package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[19][19];

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            board[x-1][y-1] = 1;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.printf("%d ",board[i][j]);
            }
            System.out.println();
        }

    }
}

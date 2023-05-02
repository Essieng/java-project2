package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mazeMap = new int[10][10];

        for (int i = 0; i < mazeMap.length; i++) {
            for (int j = 0; j < mazeMap[i].length; j++) {
                mazeMap[i][j] = scanner.nextInt();
            }
        }

        int currentPositionX = 1;
        boolean isFindFood = false;

        for (int i = 1; i < mazeMap.length; i++) {
            if (!isFindFood) {
                for (int j = currentPositionX; j < mazeMap[i].length; j++) {
                    if (mazeMap[i][j] == 0) {
                        mazeMap[i][j] = 9;
                    } else if (mazeMap[i][j] == 1) {
                        currentPositionX = j - 1;
                        break;
                    } else if (mazeMap[i][j] == 2) {
                        mazeMap[i][j] = 9;
                        isFindFood = true;
                        break;
                    }
                }
            }
        }


        for (int i = 0; i < mazeMap.length; i++) {
            for (int j = 0; j < mazeMap[i].length; j++) {
                System.out.printf("%d ", mazeMap[i][j]);
            }
            System.out.println();
        }
    }
}

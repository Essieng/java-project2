package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int[][] intArr = new int[5][5];
        intArr[2][0] = 1;
        intArr[2][1] = 1;
        intArr[2][2] = 1;
        intArr[2][3] = 1;
        intArr[2][4] = 1;
        System.out.println(Arrays.toString(intArr[0]));
        System.out.println(Arrays.toString(intArr[1]));
        System.out.println(Arrays.toString(intArr[2]));
        System.out.println(Arrays.toString(intArr[3]));
        System.out.println(Arrays.toString(intArr[4]));
        System.out.println();

        intArr[0][0] = 2;
        intArr[1][0] = 2;
        intArr[2][0] = 2;
        intArr[3][0] = 2;
        intArr[4][0] = 2;
        System.out.println(Arrays.toString(intArr[0]));
        System.out.println(Arrays.toString(intArr[1]));
        System.out.println(Arrays.toString(intArr[2]));
        System.out.println(Arrays.toString(intArr[3]));
        System.out.println(Arrays.toString(intArr[4]));
        System.out.println();
    }
}

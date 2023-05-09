package com.example.javaproject2.week4.day16;

import java.util.Arrays;

public class SeparateToMethod {

    public static void printArray(int[][] intArr) {
        System.out.println(Arrays.toString(intArr[0]));
        System.out.println(Arrays.toString(intArr[1]));
        System.out.println(Arrays.toString(intArr[2]));
        System.out.println("--------------");
    }
    public static void main(String[] args) {
        int[][] intArr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        printArray(intArr);

        intArr[0][0] = 0;
        intArr[1][1] = 0;
        intArr[2][2] = 0;
        printArray(intArr);

        intArr[0][2] = 0;
        intArr[1][1] = 0;
        intArr[0][2] = 0;
        printArray(intArr);
    }
}

package com.example.javaproject2.week2.day10;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        int[] intArr = {2, 1, 7, 9};
        boolean check = intArr[0] > intArr[1];
        if (check) {
            int temp = intArr[0];
            intArr[0] = intArr[1];
            intArr[1] = temp;
        }
        System.out.println(Arrays.toString(intArr));
    }
}

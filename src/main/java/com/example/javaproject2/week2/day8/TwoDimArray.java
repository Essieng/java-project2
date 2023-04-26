package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int [][] intArr = new int[3][3];
        int [] intArr1 = intArr[0];
        intArr1[0] = 1;
        System.out.println(Arrays.toString(intArr[0]));
        System.out.println(Arrays.toString(intArr[1]));
        System.out.println(Arrays.toString(intArr[2]));
    }
}

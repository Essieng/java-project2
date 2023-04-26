package com.example.javaproject2.week2.day8;

import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] intArr1= new int[3][3];
        System.out.println(Arrays.toString(intArr1[0]));
        System.out.println(Arrays.toString(intArr1[1]));
        System.out.println(Arrays.toString(intArr1[2]));

        int[][] intArr2=new int[10][10];
//        System.out.println(Arrays.toString(intArr2[0]));
//        System.out.println(Arrays.toString(intArr2[1]));
//        System.out.println(Arrays.toString(intArr2[2]));
//        System.out.println(Arrays.toString(intArr2[3]));
//        System.out.println(Arrays.toString(intArr2[4]));
//        System.out.println(Arrays.toString(intArr2[5]));
//        System.out.println(Arrays.toString(intArr2[6]));
//        System.out.println(Arrays.toString(intArr2[7]));
//        System.out.println(Arrays.toString(intArr2[8]));
//        System.out.println(Arrays.toString(intArr2[9]));

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(intArr2[i]));
        }

        int[] ar = {1,2,3,4};

    }
}

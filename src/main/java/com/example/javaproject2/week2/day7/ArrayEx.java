package com.example.javaproject2.week2.day7;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] intArr = new int[5];
        System.out.println("Memory address: "+intArr);
        System.out.println(Arrays.toString(intArr));

        intArr[0] = 1;
        intArr[1] = 11;
        intArr[2] = 111;
        intArr[3] = 1111;
        intArr[4] = 11111;

        System.out.println(Arrays.toString(intArr));

        float[] floatArr = new float[3];
        String[] strArr = new String[3];
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(strArr));

    }
}

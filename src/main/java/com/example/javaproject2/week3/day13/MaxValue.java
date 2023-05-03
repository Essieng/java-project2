package com.example.javaproject2.week3.day13;

public class MaxValue {
    public static void main(String[] args) {
        int[] intArr = {2,1,0,31,97};
        int maxVal = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (maxVal<intArr[i]) {
                maxVal = intArr[i];
            }
        }
        System.out.println("maxValue = " + maxVal);
    }
}

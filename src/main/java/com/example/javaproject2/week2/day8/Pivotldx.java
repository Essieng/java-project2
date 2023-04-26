package com.example.javaproject2.week2.day8;

public class Pivotldx {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 4, 1, 5, 9};
        int pivot1 = arr1.length / 2;
        System.out.printf("length: %d, pivot: %d, midValue: %d\n", arr1.length, pivot1, arr1[pivot1]);

        int[] arr2={3,4,6,8};
        int pivot2 = arr2.length / 2;
        System.out.printf("length: %d, pivot: %d, midValue: %d\n", arr2.length, pivot2, arr2[pivot2]);
    }
}

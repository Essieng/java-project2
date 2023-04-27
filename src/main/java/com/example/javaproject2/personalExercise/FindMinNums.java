package com.example.javaproject2.personalExercise;

public class FindMinNums {
    public static void main(String[] args) {
        int a = 3;
        int b = 25;
        int c = 13;
        int d = 7;
        System.out.printf("Min Number is ... --> %d\n", (a > b ? b : a) > (c > d ? d : c) ? (c > d ? d : c) : (a > b ? b : a));

        int num1 = 233;
        int num2 = 264;
        int num3 = 443;
        int num4 = 112;
        int num5 = 119;
        System.out.printf("Min Number is ... --> %d\n",
                ((num1 > num2 ? num2 : num1) > (num3 > num4 ? num4 : num3) ?
                (num3 > num4 ? num4 : num3) : (num1 > num2 ? num2 : num1)) > num5 ?
                        num5 : ((num1 > num2 ? num2 : num1) > (num3 > num4 ? num4 : num3) ?
                        (num3 > num4 ? num4 : num3) : (num1 > num2 ? num2 : num1)));
    }
}

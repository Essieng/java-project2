package com.example.javaproject2.week2.day6;

public class NarrowingCasting {
    public static void main(String[] args) {

        double dVal = 123.456;
        int iVal = (int) dVal;
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);

        String str = "1";
        int num = Integer.parseInt(str);
        int result1 = 1 + num;
        System.out.println("result1 = " + result1);

        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);
        System.out.println(Float.parseFloat(val1)+Float.parseFloat(val2));




    }
}

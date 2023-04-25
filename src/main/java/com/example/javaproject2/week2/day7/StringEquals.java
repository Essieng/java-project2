package com.example.javaproject2.week2.day7;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD"=="GOLD");

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0,1)==str2);
        System.out.println(str1.substring(0,1).equals(str2));

        String str = "10 3 19 28 7 488";
        String[] strArr = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
        System.out.println(strArr[4]);
        System.out.println(strArr[5]);
    }
}

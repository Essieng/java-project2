package com.example.javaproject2.week2.day7;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s2);
        System.out.println(s1 + " " + s2);

        String name = "박준수";
        int balance = 10000;
        String massage = name + " 님의 통장 잔고는 " + balance + " 원 입니다.";
        System.out.println(massage);
        System.out.printf("%s 님의 통장 잔고는 %d 원 입니다.\n", name, balance);

        String result = String.format("%s님의 통장 잔고는 %d원 입니다.", name, balance);
        System.out.println(result);

        System.out.println("Hello".substring(0,1));
        String str = "Hello";
        String firstLetter = str.substring(0,1);
        System.out.println(firstLetter);

        String str1 = "대한민국";
        String firstLetter1 = str1.substring(0,2);
        System.out.println(firstLetter1);
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1,3));

    }
}

package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int insertNum = scanner.nextInt();
        int startNum = 1;
        while(startNum<=insertNum){
            if (startNum%3!=0) {
                System.out.print(startNum+" ");
            }
            startNum++;
        }
    }
}

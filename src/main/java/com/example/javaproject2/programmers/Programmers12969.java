package com.example.javaproject2.programmers;

import java.util.Scanner;

class Programmers12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int j = 0; j<b; j++){
            for(int i = 0; i<a; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
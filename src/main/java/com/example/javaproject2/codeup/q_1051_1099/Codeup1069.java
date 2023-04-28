package com.example.javaproject2.codeup.q_1051_1099;

import java.util.Scanner;

public class Codeup1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char score = scanner.next().charAt(0);
        switch (score) {
            case 'A' : {
                System.out.println("best!!!");
                break;
            }
            case 'B' : {
                System.out.println("good!!");
                break;
            }
            case 'C' : {
                System.out.println("run!");
                break;
            }
            case 'D' : {
                System.out.println("slowly~");
                break;
            }
            default : System.out.println("what?");
        }
    }
}

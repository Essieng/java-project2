package com.example.javaproject2.programmers;

import java.util.Scanner;

public class Programmers181934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ineq, eq;
        int n, m;
        int answer = 0;
        ineq = scanner.next();
        eq = scanner.next();
        n = scanner.nextInt();
        m = scanner.nextInt();

        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = n <= m ? 1 : 0;
            } else {
                answer = n < m ? 1 : 0;
            }
        } else {
            if (eq.equals("=")) {
                answer = n >= m ? 1 : 0;
            } else {
                answer = n > m ? 1 : 0;
            }
        }

        System.out.println("answer = " + answer);
    }
}

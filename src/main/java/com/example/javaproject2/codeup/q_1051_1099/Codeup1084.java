package com.example.javaproject2.codeup.q_1051_1099;

import java.io.*;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] rgbArr = br.readLine().split(" ");

        int count = 0;
        for (int i = 0; i < Integer.valueOf(rgbArr[0]); i++) {
            for (int j = 0; j < Integer.valueOf(rgbArr[1]); j++) {
                for (int k = 0; k < Integer.valueOf(rgbArr[2]); k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}

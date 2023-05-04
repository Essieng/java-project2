package com.example.javaproject2.programmers;

public class Programmers181943 {
    public static void main(String[] args) {
        String my_string;
        String overwrite_string;
        int s;
        String answer;

        my_string = "He11oWor1d";
        overwrite_string = "lloWorl";
        s = 2;

        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());

        System.out.println(answer);

    }
}

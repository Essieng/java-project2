package com.example.javaproject2.programmers;

public class Programmers181932 {
    public static void main(String[] args) {
        String code = "abc1abc1abc";
        String answer = "";
        String ret = "";
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            char c1 = code.charAt(idx);
            if (mode == 0) {
                if (code.charAt(idx) == '1') {
                    mode = 1;
                } else if (idx % 2 == 0) {
                    ret += c1;
                }

            } else {
                if (code.charAt(idx) == '1') {
                    mode = 0;
                } else if (idx % 2 == 1) {
                    ret += c1;
                }
            }
        }
        System.out.println(ret);
    }
}

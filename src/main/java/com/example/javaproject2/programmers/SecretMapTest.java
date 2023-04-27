package com.example.javaproject2.programmers;

import java.util.Arrays;

public class SecretMapTest {
    public static void main(String[] args) {

        SecretMapTest t1 = new SecretMapTest();
        t1.solution(5, new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10});


    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 1. arr1과 arr2의 원소들을 이진수로 바꾼 뒤, or 비트 논리연산 수행.
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            System.out.println("2진수 값(포메팅 전): " + str);

            // 2. 5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            str = String.format("%" + n + "s", str);
            System.out.printf("자릿수대로 포맷팅:%"+n+"s",str);

            // 3. 1->#, 0 -> 공백 으로 바꾼다.
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");

            // 4. 한 줄 완성.
            answer[i] = str;
            System.out.println(Arrays.toString(answer) + '\n');

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

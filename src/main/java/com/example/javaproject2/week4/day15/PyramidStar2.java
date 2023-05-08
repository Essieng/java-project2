package com.example.javaproject2.week4.day15;

public class PyramidStar2 {
    public static void main(String[] args) {
        int height = 4;
        //역으로 생각: 피라미드가 4단, 예를들어 x단이면 x번째 홀수가 된다.(1,3,5,7,...)
        //별이 찍혀야 하는 개수는 x번째 홀수가 되므로
        //역으로 공백은 x단의 별 개수(예를 들어 4단이면 7개) - 현재 단의 별 개수(4단 기준 1단은 별 1개) = 공백 6칸
        // 별 기준 우측은 신경 쓸 필요 없고, 별 기준으로 양 옆은 같은 개수의 공백을 갖는다 -> 3개

        for (int i = 0; i < height; i++) {
            // 3 2 1 0
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

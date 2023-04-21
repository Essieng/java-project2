package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    void isSameXy() {
        boolean isSameXy = x == y;
        System.out.println("해당 좌표의 x와 y는 같은가?: " + isSameXy);
    }

    void getDistance(Point pointNameToCompare) {

        int xL = pointNameToCompare.x - this.x;
        int yL = pointNameToCompare.y - this.y;

        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        double result = Math.sqrt(sumOfPow);
        System.out.printf("비교한 좌표의 직선길이는 약 '%.02f' 입니다.", result);

    }
}

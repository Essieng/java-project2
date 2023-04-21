package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 1;
        System.out.println("p1: x=" + p1.x + ", y=" + p1.y);
        p1.isSameXy();

        Point p2 = new Point();
        p2.x = 2;
        p2.y = 3;
        System.out.println("p2: x=" + p2.x + ", y=" + p2.y);

        Point p3 = new Point();
        p3.x=3;
        p3.y=3;
        System.out.println("p3: x=" + p3.x + ", y=" + p3.y);
        p3.isSameXy();
        p3.getDistance(new Point(0,0));

    }
}

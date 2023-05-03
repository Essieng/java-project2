package com.example.javaproject2.codeup.q_1301_AndSoOn;

import java.util.Scanner;

public class Codeup2009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myCouponCount = scanner.nextInt();
        int requiredCoupons = scanner.nextInt();
        int countOfCoffeeCanToEat = 0;
        while (myCouponCount >= requiredCoupons) {
            myCouponCount -= requiredCoupons;
            myCouponCount++;
            countOfCoffeeCanToEat++;
        }
        System.out.println(countOfCoffeeCanToEat);
    }
}

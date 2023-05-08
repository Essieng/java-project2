package com.example.javaproject2.week4.day15;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.IsSufficient();
        if (isSufficient) {
            //결제를 요청합니다.
        } else {
            //잔액이 부족합니다.
        }
    }
}

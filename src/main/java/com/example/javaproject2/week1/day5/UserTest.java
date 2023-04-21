package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        u1.userName="User1";
        u1.userAge=19;
        u1.userPhoneNumber="010-1111-2222";

        User u2=new User("User2","010-1212-3434",13);

        System.out.printf("'%s' 님은 성인입니까? -> %s\n",u1.userName,u1.isAdult());
        System.out.printf("'%s' 님은 성인입니까? -> %s\n",u2.userName,u2.isAdult());
    }
}

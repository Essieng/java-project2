package com.example.javaproject2.week2.day8;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[2];

        students[0] = new Student();
        students[0].name = "김김김";
        students[0].phoneNumber = "010-1111-1111";
        students[0].age = 20;

        students[1] = new Student();
        students[1].name = "이이이";
        students[1].phoneNumber = "010-2222-2222";
        students[1].age = 21;


    }
}

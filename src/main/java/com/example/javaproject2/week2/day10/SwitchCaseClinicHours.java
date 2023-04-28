package com.example.javaproject2.week2.day10;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "수";
        String time = "휴진";
        switch (day) {
            case "월", "화", "목", "금", "토":
                time = "09:30-18:30";
                break;
            case "수", "일":
                break;
        }
        System.out.printf("%s요일 영업(시간)은 %s 입니다.\n", day, time);
    }
}

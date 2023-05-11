package com.example.javaproject2.week4.day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileEx {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\J.S.PARK\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv"));
    }
}

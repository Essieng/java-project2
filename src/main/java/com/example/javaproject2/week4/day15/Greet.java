package com.example.javaproject2.week4.day15;

public class Greet {
    public void printMassage(String message) {
        System.out.println(message);
    }

    public void printMassageWithName(String name, String message) {
        System.out.printf("%s님 %s\n", name, message);
    }

    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.printMassage("안녕하세요.");
        greet.printMassageWithName("박준수", "좋은하루 되세요.");
    }
}

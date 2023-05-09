package com.example.javaproject2.week4.day16;

public class MultiplicationTableMethod {

    private String multipleSymbol;

    public MultiplicationTableMethod(String multipleSymbol){
        this.multipleSymbol = multipleSymbol;
    }

    public void printMultiplicationTable(int ofN) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("%d %s %d = %d\n", ofN, multipleSymbol, i, ofN * i);
        }
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        MultiplicationTableMethod mt = new MultiplicationTableMethod("x");
        mt.printMultiplicationTable(2);
        mt.printMultiplicationTable(4);
        MultiplicationTableMethod mt2 = new MultiplicationTableMethod("*");
        mt2.printMultiplicationTable(7);
        mt2.printMultiplicationTable(9);
    }
}

package com.example.javaproject2.week4.day17;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if (i <= pivot) {
//                System.out.printf("pivot:%d %d 0:%d *:%d\n", pivot, i, -2 + h - i - 2, 2 * i + 1);
                System.out.printf("%s%s\n",
                        getRepeatedSymbol(" ", pivot - i),
                        getRepeatedSymbol("*", 2 * i + 1));
            } else {
//                System.out.printf("pivot:%d %d 0:%d *:%d\n", pivot, i, i - pivot, 2 * (h - i) - 1);
                System.out.printf("%s%s\n",
                        getRepeatedSymbol(" ", i - pivot),
                        getRepeatedSymbol("*", 2 * (h - i) - 1));
            }
        }
    }
}

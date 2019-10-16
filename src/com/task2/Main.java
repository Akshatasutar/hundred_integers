package com.task2;

public class Main {
    public static void main(String[] args) {
        int[] fiveInts = new int[5];
        fiveInts[0] = 5;
        fiveInts[1] = 4;
        for (int i = 2; i < 5; i++) {
            fiveInts[i] = 5 - i;
        }
        for (int x : fiveInts) {
            System.out.println(x);
        }

        System.out.println(fiveInts);
    }
}

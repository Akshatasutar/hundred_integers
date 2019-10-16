package com.task1;

public class Main {
    public static void main(String[] args) {
        int[] fiveInts = new int[5];
        fiveInts[0] = 1;
        fiveInts[1] = 2;
        for (int x = 2; x < 5; x++) {
            fiveInts[x] = x+1;
        }
        for (int x: fiveInts) {
            System.out.println(x);
        }
    }
}

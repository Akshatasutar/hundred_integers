package com.task11;

public class Main {
    public static void main(String[] args) {
        int[] twentyInts = new int[20];
        twentyInts[0] = 0;
        twentyInts[1] = 1;

        for (int i = 2; i < twentyInts.length; i++ ) {
            twentyInts[i] = twentyInts[i - 1] + twentyInts[i - 2];
        }

        for (int x: twentyInts) {
            System.out.println(x);
        }
    }
}

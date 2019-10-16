package com.task10;

public class Main {
    public static void main(String[] args) {
        int[] hundred1 = new int[51];
        int[] secondHundred = new int[51];
        for (int i = 0; i < hundred1.length; i++) {
            hundred1[i] = i * 2;
        }

        for (int i = 0; i < hundred1.length; i++) {
        secondHundred[i] = hundred1[hundred1.length - 1 - i];
        }

        for(int x : secondHundred) {
            System.out.println(x);
        }
    }
}

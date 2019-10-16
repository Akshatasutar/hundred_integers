package com.task8;

public class Main {
    public static void main(String[] args) {
        int[] hundred = new int[51];
        hundred[0] = 0;
        for (int i = 1; i < hundred.length; i++) {
            //if (hundred[i - 1] >= 100) {
                //break;}
            hundred[i]  = hundred[i - 1] + 2;
        }

        for (int x: hundred) {
            System.out.println(x);
        }
    }
}

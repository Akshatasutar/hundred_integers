package com.task9;

public class Main {
    public static void main(String[] args) {
        int[] hundred1 = new int[51];
        int[] secondHundred = new int[51];
        for (int i = 0; i < hundred1.length; i++) {
            hundred1[i] = i * 2;
        }

        //for (int i = 0; i < 51; i++) {
            //secondHundred[i] = hundred1[i];
        //}
        System.arraycopy(hundred1, 0,
                secondHundred, 0, hundred1.length);

        for(int x : secondHundred) {
            System.out.println(x);
        }
    }
}

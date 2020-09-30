package com.Task7;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int step = 0;
        Main object = new Main();
        while (n < 1000000) {
            step++;
            double amount = object.fiveFriends(step);
            n += amount;
        }

        System.out.println("After step " + (step - 1) + ", amount is: " );
        System.out.println(n - object.fiveFriends(step));

        System.out.println("After step " + step + ", amount is: " );
        System.out.println(n);

        System.out.println("Hence, 1000 000 is reached between steps "
                + (step - 1) + " and " + step  );
        System.out.println(n);
        System.out.println("done!!");

    }

    private double fiveFriends(int n) {
            return Math.pow(5, n);
    }
}

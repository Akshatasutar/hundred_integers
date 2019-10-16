package com.task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userStrings = new String[5];
        for (int i = 0; i < userStrings.length; i++) {
            System.out.println("Please enter string to add: ");
            String str = input.nextLine();
            userStrings[i] = str;
        }

        for (String x : userStrings) {
            System.out.println(x);
        }

    }
}

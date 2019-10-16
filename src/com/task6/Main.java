package com.task6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userStrings = new String[5];
        for (int i = 0; i < userStrings.length; i++) {
            System.out.println("Please enter string to add: ");
            String str = input.nextLine();
            userStrings[userStrings.length - 1 - i] = str;
        }


        for (String x : userStrings) {
            System.out.println(x);
        }
    }
}

package com.task7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] doubleArray = new double[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Enter a decimal value: ");
            double value = input.nextDouble();
            doubleArray[i] = value;
        }

        System.out.println("-----List created-----0");
        System.out.println("Enter a number between 0 and 4: ");
        int index = input.nextInt();
        System.out.println("Number at position " + index + " is "
                + doubleArray[index]);
    }
}

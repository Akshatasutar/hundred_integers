package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main object = new Main();
        int sum = object.add(1,2,3,4,5,6);
        System.out.println(sum);
    }
    private int add(int...numbers) { //int...numbers is an array
        int sum = 0;                 //creates a copy of the list
                   // while iterating through. So modifications within the loop will not affect the array.
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

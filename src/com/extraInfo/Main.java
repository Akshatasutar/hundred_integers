package com.extraInfo;

public class Main {
    public static void main(String[] args) {
        if( args.length != 3) {
            System.out.println("use these parameters");
        }
        int choice = 1;
        switch (choice) {
            case 1:
            System.out.println("Its 1.");
            choice = 3;
            break;
            case 2:
                System.out.println("Its 2.");
                break;
            case 3:
                System.out.println("its 3.");
                break;
            default:
                System.out.println("hmmmmm");
        }
    }
}

package com.edesk.test;

public class Hello {

    public static void main(String[] args) {
        String result = verifire(5);
        System.out.println("Enter number is : " + result);
    }

    public static String verifire(int number) {

        if (number % 2 == 0) {
            return "Even number";
        } else {
            return "Odd number";
        }
    }
}

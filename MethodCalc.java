package com.jetbrains;

public class MethodCalc {
    public static int add(int a, int b) {
        // This works!
        return a + b;
    }

    public static int subtract(int a, int b) {
        // FIX the line below!
        return a - b;
    }

    public static int multiply(int a, int b) {
        // FIX the line below!
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // First we call the add function.
        // It takes two input parameters which are 5 and 7 here.
        // The return value of add(), which is 12,
        // gets saved in the variable x.
        int x = add(5, 7);
        System.out.println(x);
        // Then we print out the value of x in our print statement.
        int y = subtract(10, 6);
        System.out.println(y);
        int z = multiply(3, 8);
        System.out.println(z);
        int s = divide(20, 4);
        System.out.println(s);
    }
}
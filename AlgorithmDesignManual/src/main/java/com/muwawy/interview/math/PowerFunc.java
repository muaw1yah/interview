package com.muwawy.interview.math;

public class PowerFunc {

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;

        int result = power(base, exponent);

        System.out.printf("'%s'^'%s' --> %s%n", base, exponent, result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) return 1;
        int x = power(base, exponent/2);
        if (exponent % 2 == 0) return x * x;
        else return base * (x * x);
    }
}

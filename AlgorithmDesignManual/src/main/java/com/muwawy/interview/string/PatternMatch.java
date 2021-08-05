package com.muwawy.interview.string;

import java.util.Arrays;

public class PatternMatch {

    public static void main(String[] args) {
        String text = "Hi muwawy";
        String p = "muwawy";
        String response = match(text, p) ? "Found": "Not Found";

        System.out.printf("Looking for '%s' in '%s' --> %s%n", text, p, response);
    }

    public static boolean match(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();

        for (int i=0; i <= m-n; i++)
        {
            int j = 0;
            while (j < n && text.charAt(i+j) == pattern.charAt(j)) {
                j = j+1;
            }

            if (j == n) {
                return true;
            }
        }

        return false;
    }
}

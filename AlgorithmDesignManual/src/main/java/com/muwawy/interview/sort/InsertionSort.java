package com.muwawy.interview.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 0, 8, 3, 11, 2};

        System.out.println(Arrays.toString(arr1)+" --------> "+ Arrays.toString(sort(arr1)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++)
        {
            int j = i;

            while (j > 0 && arr[j] < arr[j-1]) {
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j = j - 1;
            }
        }

        return arr;
    }
}

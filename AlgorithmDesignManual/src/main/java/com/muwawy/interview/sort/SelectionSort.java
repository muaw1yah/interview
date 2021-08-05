package com.muwawy.interview.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 3, 5, 3};

        System.out.println(Arrays.toString(arr1)+" --------> "+ Arrays.toString(sort(arr1)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
        {
            int pos = i;

            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[pos] > arr[j]) pos = j;
            }

            if (pos != i) {
                int t = arr[i];
                arr[i] = arr[pos];
                arr[pos] = t;
            }
        }

        return arr;
    }
}

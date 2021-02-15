package week10d05;

import java.util.Arrays;


public class Calculator {


    public int findMinSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array not given or has no elements");
        }
        int sum = 0;
        Arrays.sort(arr);
        int result = Math.min(arr.length,4);
        for (int i = 0; i < result; i++) {
            sum += arr[i];
        }
        return sum;
    }

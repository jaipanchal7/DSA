package com.jai.Arrays;

import java.util.Arrays;

public class MaxTwoSum_SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,400,2,6,10,100,23};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max Sum : " + maxSum(arr,2));
    }

    protected static int maxSum(int[] arr, int k) {
        int maxsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i+1; j < i+k && j<arr.length; j++) {
                sum = sum + arr[i]+arr[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}

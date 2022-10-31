package com.jai.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,21,33,46,58,68,73};
        int target = 73;
        int ans = bSearch(arr,target);
        System.out.println(ans);
    }

    static int bSearch(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(target < arr[mid]){
                e = mid-1;
            }
            else if (target > arr[mid]){
                s = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}


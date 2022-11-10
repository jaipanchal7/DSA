package com.jai.Basic_Programs;

import java.util.*;

public class AbsoluteDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int N = sc.nextInt();

        int[] A = new int [N];

        System.out.print("Enter array : ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter target : ");
        int k = sc.nextInt();

        System.out.println(absDiff(N,A,k));
    }

    static int absDiff(int N,int[] A,int k){
        int result = -404;
        int inputArrIndex = -1;
        int outputArrIndex = -1;

        for (int i = 0; i < N; i++) {
            if (A[i]==k){
                inputArrIndex = i;
            }
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if (A[i]==k){
                outputArrIndex = i;
            }
        }
        result = Math.abs(outputArrIndex - inputArrIndex);
        return result;
    }

// {2,7,4,8,1,6,0,4}
// {0,1,2,4,4,6,7,8}
}

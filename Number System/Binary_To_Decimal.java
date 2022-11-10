package com.jai.Number_System;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {

        System.out.print("Enter a Binary Number : ");
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();

        int ans = 0; // converted to decimal number
        int pw = 1; // 2^0 = 1 (power of 2)

        while(binaryNumber>0){
            int unit_digit = binaryNumber % 10;
            ans = ans + (unit_digit * pw);
            binaryNumber = binaryNumber/10;
            pw = pw * 2;
        }
        System.out.println(ans);
    }
}

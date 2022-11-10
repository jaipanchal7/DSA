package com.jai.Number_System;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {

        System.out.print("Enter a Decimal Number : ");
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();

        int ans = 0; // converted to binary number
        int pw = 1; // power of 10

        while (decimalNumber>0){
            int parity = decimalNumber % 2;
            ans = ans + (parity * pw);
            decimalNumber = decimalNumber/2;
            pw = pw * 10;
        }
        System.out.println(ans);
    }
}

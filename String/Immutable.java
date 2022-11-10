package com.jai.Basic_Programs;

public class Immutable {
    public static void main(String[] args) {
        String str = "Kunal";
        String str1 = "Kunal";
        String x1 = new String("Rajat");
        String x2 = new String("Rajat");
//        str = "Jai";
        System.out.println(str.equals(str1)); // true
        System.out.println(str==str1); // true
        System.out.println(x1.equals(x2)); // true
        System.out.println(x1==x2); // false
        int a = 10;
        int b = a;
        a=11;
        System.out.println(b); // 10

        int[] arr = {1,2,3};
        int[] arr1 = {1,2,3};
    }
}

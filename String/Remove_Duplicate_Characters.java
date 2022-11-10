package com.jai.Basic_Programs;

import java.util.Arrays;

public class Remove_Duplicate_Characters {
    public static void main(String[] args) {

        String s = "cbacdcbc";
        System.out.println("Previous : " + s);
        System.out.println("After : " +removeDuplicateLetters(s));
    }

    static String removeDuplicateLetters(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);

        String con = new String(arr);
//        String con = "";
//        for (int i = 0; i < arr.length; i++) {
//            con = con + arr[i];
//        }

        String ans = String.valueOf(con.charAt(0));
        int count = 1;
        for (int i = 1; i < con.length(); i++) {
            char curr = con.charAt(i);
            char prev = con.charAt(i-1);
            if(curr!=prev){
                ans = ans + curr;
            }
        }
        // System.out.println(ans);
        return ans;

    }

}





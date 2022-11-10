package com.jai.Basic_Programs;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "abcecba";
//        String b = str.toLowerCase();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        String x = str.toLowerCase();
        int s = 0;
        int e = x.length()-1;
        while(s<=e){
            if(x.charAt(s)!=x.charAt(e))
                return false;

            s++;
            e--;
        }
        return true;
    }
}

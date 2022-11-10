package com.jai.Basic_Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int x = 40;
        boolean hi=false;
        System.out.println("Prime numbers till : " + x);
        for (int i = 0; i < x; i++) {
            if(isPrime(i)==true){
                System.out.println(i);
            }
//            System.out.printf("%d %B\n",i,isPrime(i));
        }
//        System.out.println(isPrime(8));
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

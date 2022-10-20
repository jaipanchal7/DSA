package com.jai.String;

public class ABC {
    public static void main(String[] args) {
        String name = "abc*dhr";

        int x=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='*'){
                x = i;
            }
        }
        int y = x+1;
        int i=0;
        while (i<x && y<name.length()){
            System.out.print(name.charAt(i));
            System.out.print(name.charAt(y));
            i++; y++;
        }
    }
}

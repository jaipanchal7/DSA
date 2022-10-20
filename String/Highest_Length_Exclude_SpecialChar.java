package com.jai.String;

import java.util.Arrays;

public class Highest_Length_Exclude_SpecialChar {
    public static void main(String[] args) {
        String str = "Hello^*&%&oooooo! To the world of Ques*)*^tions";

        String[] sol = str.split(" ");
        System.out.println(Arrays.toString(sol));

//        str = str.replaceAll("[^a-zA-Z0-9]", "");
//        System.out.println(str);

        String ans = "";

        for (int i = 0; i < sol.length; i++) {
            ans = ans + sol[i].replaceAll("[^a-zA-Z0-9]", "");
            ans += " ";
        }
        System.out.println(ans);
    }
}

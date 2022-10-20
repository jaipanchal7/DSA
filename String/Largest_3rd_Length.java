package com.jai.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Largest_3rd_Length {
    public static void main(String[] args) {
//        String[] str = {"Hema","Kritika", "dhruv", "pradyuman"};
        String[] str = {"jai","abhishek", "dhruv", "yo"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str));
        System.out.println(arrayList);

        HashSet<String> hs = new HashSet<>();
        int lengthOfString = 0, indexOfString = 0;
        int j =0;
        while(j<3) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).length() > lengthOfString) {
                    indexOfString = i;
                    lengthOfString = arrayList.get(i).length();
                }
            }
            if(j==2){
                System.out.println(arrayList.get(indexOfString));
            }
            hs.add(arrayList.get(indexOfString));
            arrayList.remove(indexOfString);
            j++;
            lengthOfString=0; indexOfString=0;
        }
//        System.out.println(arrayList);
//        System.out.println(hs);
    }
}

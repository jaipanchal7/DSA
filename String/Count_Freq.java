package com.jai.String;

public class Count_Freq {
    public static void main(String[] args) {
        String str = "rrrrraaajjaaattt";

        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(str.charAt(i) + "" + count);
        }
    }
}

// interview ques coder byte
//    public static String StringChallenge(String str) {
//        // code goes here
//        List<Character> list = Arrays.asList('l','g','4','3','v','e','8','r','c');
//        String ans = "";
//        for(int i=0; i<str.length(); i++){
//            int count = 1;
//            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            ans = ans + count + String.valueOf(str.charAt(i));
//        }
//        return ans;
//    }

//    public static String compression(String str) {
//        StringBuffer sb = new StringBuffer();
//        char last = str.charAt(0);
//        int count = 0;
//        for (int i=0; i< str.length(); i++) {
//            if (str.charAt(i) == last) {
//                count++;
//            } else {
//                sb.append(last + "" + count);
//                count = 1;  // here count should be 1 but not 0
//            }
//            last = str.charAt(i);
//        }
//        sb.append(last + "" + count);
//
//        String newStr = sb.toString();
//        if (newStr.length() < str.length()) {
//            return newStr;
//        } else {
//            return str;
//        }
//    }


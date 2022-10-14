package com.jai.Patterns;

public class Number {
    public static void main(String[] args) {
        int row = 4;
        int col = 7;


//           1
//          121
//         12321
//        1234321
        int k;
        for (int i=1; i<=row; i++) {        // r : 4, c : 7
            k=1;
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i && j <= row-1 + i){
                    System.out.print(k);
                    if(j<4)
                        k++;
                    else
                        k--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//           1
//          222
//         33333
//        4444444
        int k1;
        for (int i=1; i<=row; i++) {           // r : 4, c : 7
            k1=i;
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i && j <= row-1 + i)
                    System.out.print(k1);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//           1
//          232
//         34543
//        4567654
        int k2;
        for (int i=1; i<=row; i++) {        // r : 4, c : 7
            k2=i;
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i && j <= row-1 + i){
                    System.out.print(k2);
                    int x = j < 4 ? k2++ : k2--;  // use if else also
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//        6543210
//        543210
//        43210
//        3210
//        210
//        10
//        0
        int k3;
        for (int i=1; i<=row; i++) {        // r : 7, c : 7
            k3 = row-i;
//            k = (row+1)-i; // starts with 7
            for (int j=1; j<=col; j++) {
                if(j <= row+1 - i){
                    System.out.print(k3);
                    k3--;
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}

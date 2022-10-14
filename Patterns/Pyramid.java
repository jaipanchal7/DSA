package com.jai.Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int row = 7;
        int col = 4;

//        *
//        **
//        ***
//        ****
//        *****
        for (int i=1; i<=row; i++) {        // r : 5, c : 5
            for (int j=1; j<=col; j++) {
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();


//            *
//           **
//          ***
//         ****
//        *****
        for (int i=1; i<=row; i++) {        // r : 5, c : 5
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//        *****
//         ****
//          ***
//           **
//            *
        for (int i=1; i<=row; i++) {        // r : 5, c : 5
            for (int j=1; j<=col; j++) {
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//        *****
//        ****
//        ***
//        **
//        *
        for (int i=1; i<=row; i++) {        // r : 5, c : 5
            for (int j=1; j<=col; j++) {
                if(j <= row+1 -i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//            *
//           ***
//          *****
//         *******
//        *********
        for (int i=1; i<=row; i++) {        // r : 5, c : 9
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i && j <= row-1 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
        boolean k;
        for (int i=1; i<=row; i++) {        // r : 5, c : 9
            k=true;
            for (int j=1; j<=col; j++) {
                if(j >= row+1 - i && j <= row-1 + i && k){
                    System.out.print("*");
                    k = false;
                }
                else{
                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }

        System.out.println();

//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
        for (int i=1; i<=row; i++) {        // r : 5, c : 9
            for (int j=1; j<=col; j++) {
                if(j <= row+1 - i || j >= row-1 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//           *
//          ***
//         *****
//        *******
//         *****
//          ***
//           *
        int k0=0;
        int n = (row+1)/2;
        for (int i=1; i<=row; i++) {        // r : 7, c : 7
            if(i<=n){
                k0++;
            }else
                k0--;
            for (int j=1; j<=col; j++){
                if(j >= n+1-k0 && j <= n-1+k0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println();

//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *
        int k1=0;
        for (int i=1; i<=row; i++) {        // r : 7, c : 4
            if(i<=(row+1)/2)
                k1++;
            else k1--;
            for (int j=1; j<=col; j++) {
                if(j <= k1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();


//        ****
//         ***
//          **
//           *
//          **
//         ***
//        ****
        int k2=0;
        for (int i=1; i<=row; i++) {        // r : 7, c : 4
            if(i<=(row+1)/2)
                k2++;
            else k2--;
            for (int j=1; j<=col; j++) {
                if(j >= k2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

//        *******
//         *****
//          ***
//           *
        for (int i=1; i<=row; i++) {        // r : 7, c : 4
            for (int j=1; j<=2*row-1; j++) {
                if(j >= i && j <= 2*row - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
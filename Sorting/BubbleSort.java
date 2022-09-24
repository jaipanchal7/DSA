import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort = pairs of adjacent elements are compared, and the elements
	    //		         swapped if they are not in order.
	
	    //				 Quadratic time O(n^2)
	    //				 small data set = okay-ish
	    //				 large data set = BAD (plz don't use this..)

        int[] arr = {5,3,4,1,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped = true; // by default true
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 0; j < arr.length-i-1; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (swapped == false) { // !false = true // Means array already sorted!
                break;
            }
        }
    }
}

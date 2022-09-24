import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        // Insertion sort = after comparing elements to the left
	    // shift elements to the right to make room to insert a value

        // Quadratic time O(n^2)
        // small data set = decent
        // large data set = BAD

        // Less steps than Bubble sort
        // Best case is O(n) compared to Selection sort O(n^2)

        int[] arr = {5,4,3,2,1};
        ins_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void ins_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
//        return arr;
    }
}

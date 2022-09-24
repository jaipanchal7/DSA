import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        // selection sort = search through an array and keep track of the minimum value during each iteration. At the end of each iteration, we swap values.
	
        // Quadratic time O(n^2)
        // small data set = okay
        // large data set = BAD

        int[] arr = {8,5,3,37,4,98,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        int indexofmin = 0;

        for (int i = 0; i < arr.length-1; i++) {
            indexofmin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[indexofmin]){
                    indexofmin = j;
                }
            }
//            int temp = arr[i];
//            arr[i] = arr[indexofmin];
//            arr[indexofmin] = temp;
            swap(arr,i,indexofmin);
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

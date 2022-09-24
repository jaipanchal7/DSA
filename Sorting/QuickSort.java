import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        // quick sort = moves smaller elements to left of a pivot.
        // recursively divide array in 2 partitions

        //  run-time complexity = Best case O(nlog(n))
        //  Average case O(n log(n))
        //  Worst case O(n^2) if already sorted

        //  space complexity = O(log(n)) due to recursion

        int[] arr = {8,2,5,3,9,4,7,6,1};
        int l = 0;
        int h = arr.length-1;
        quickSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] array,int start,int end) {

        if(end <= start){
            return; //base case
        }
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    static int partition(int[] array,int start,int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}

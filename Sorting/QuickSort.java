import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7};
        int l = 0;
        int h = arr.length-1;
        quickSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low<high) {  // run if one element is present
            int partionIndex;
            partionIndex = partion(arr,low,high); // Index of pivot after partition
            quickSort(arr, low, partionIndex - 1); // sort left sub array
            quickSort(arr, partionIndex + 1, high); // // sort right sub array
        }
    }
    static int partion(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l+1;
        int j = h;
        while(i<j){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if (i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,l,j);
        return j;
    }
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

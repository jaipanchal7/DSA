import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7};
        int l = 0;
        int h = arr.length-1;
        mergeSort(arr,l,h);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int low, int high){
        if(low<high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    static void merge(int[] arr,int low,int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] b = new int[arr.length];

        while (i<=mid && j<=high){
            if(arr[i]<arr[j]){
                b[k] = arr[i];
                i++; k++;
            }
            else {
                b[k] = arr[j];
                j++; k++;
            }
        }
        while (j<=high){
            b[k] = arr[j];
            k++; j++;
        }
        while (i<=mid){
            b[k] = arr[i];
            k++; i++;
        }
        for (int x = low; x <=high; x++) {
            arr[x] = b[x];
        }
    }
}

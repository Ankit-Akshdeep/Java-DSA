import java.util.*;
public class SortIt{

    public static void QuickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
            int pIdx = partition(arr,si,ei);
            QuickSort(arr, si, pIdx - 1);
            QuickSort(arr, pIdx+1, ei);
        }
    

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;
        for(int j = si; j<ei; j++){
            if(arr[j]<= pivot){
                i = i + 1;
                // swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
        i++;
        //swap a[i] and pivot
        int temp2 = pivot;
        arr[ei] = arr[i];
        arr[i] = temp2;
        return i;
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
         int arr[] = {4,6,1,3,7,9};
         QuickSort(arr, 0, arr.length- 1);
         print(arr);   
    }
}
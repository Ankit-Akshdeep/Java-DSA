import java.util.*;
public class HeapSort{
    public static void heapify(int arr[], int i, int size){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxidx = i;

            if(left < size && arr[maxidx] < arr[left]){
                maxidx = left;
            }
            if(right < size && arr[maxidx] < arr[right]) {
                maxidx = right;
            }

            if(maxidx != i){
                //swap
                int temp = arr[i];
                arr[i] = arr[maxidx];
                arr[maxidx] = temp;

                heapify(arr, maxidx, size);
            }
    }

    public static void sort(int arr[]){
        //step 1 - to build maxHeap
        int n = arr.length;
        for(int i = n/2; i>=0 ; i--){
            heapify(arr, i, n);
        }
        //step 2 - to push largest at end
        for(int i = n-1; i>=0; i--){
            //swap(first index -largest - with my last index)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
      int arr[] = {1,2,4,5,3};    
      sort(arr);

      for(int i = 0; i< arr.length ; i++){
        System.out.println(arr[i]);
      }
    }
}
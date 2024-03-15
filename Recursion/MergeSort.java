import java.util.*;
public class MergeSort{

    public static void sorting(int arr[],int si, int ei){  //to sort the array taking midpoint as the place to divide.
        //base case
        if(si>=ei){
            return;
        }
        
        //Merge Sort Algorithm
        int mid = si + (ei-si)/2;

        sorting(arr, si, mid);  //for the left part from mid
        sorting(arr, mid+1, ei); // for the right part from mid

        Merging(arr,si,mid,ei);

    }
    public static void Merging(int arr[], int si,int mid, int ei){
        //Merging two sorted arrays into one array in ascending order
        int temp[] = new int[ei-si+1];
        int i = si; int k = 0;
        int j = mid+1;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;

        }

        //for the leftover elements of first sorted part
        while(i <= mid) {
            temp[k++] = arr[i++]; 
        }

        //for the leftover elements of the second part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //to copy elements to original array
        for( k = 0, i =si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }



    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
       }
    } 

    public static void main(String[] args) {
        int arr[] = {5,3,8,4,1,9};
       sorting(arr, 0, arr.length-1);
       printArray(arr);
    }
}
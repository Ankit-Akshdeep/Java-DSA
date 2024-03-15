import java.util.*;
public class NextGreater{

    public static void findGreater(int arr[], Stack<Integer> s){
        int ng[] = new int[arr.length];

        //traverse backwards
        for(int i = arr.length -1; i>=0; i-- ){

            //step 1
            while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            //step 2
            if(s.isEmpty()){
                ng[i] = -1; 
            } else{
                ng[i] = arr[s.peek()];
            }
            //step 3
            s.push(i);
        }

        //printing the final array
        for(int i = 0; i<ng.length; i++){
            System.out.println("Next greater element of "+ arr[i]+" is: " + ng[i]);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6,8,0,1,3};
        findGreater(arr,s);

    }
}
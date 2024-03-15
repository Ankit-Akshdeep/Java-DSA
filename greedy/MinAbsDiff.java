import java.util.*;
public class MinAbsDiff{
    public static void main(String[] args) {
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        //sorting both the arrays.
        Arrays.sort(A);
        Arrays.sort(B);

        int AbsDiff = 0;
        
        for(int i = 0; i<A.length; i++){
            AbsDiff += Math.abs(A[i] - B[i]);

        }
        System.out.println("Minimum sum of absolute difference =  "+ AbsDiff);
    }
}
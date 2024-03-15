import java.util.*;

import javax.swing.Action;
public class ActivityNotSorted{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};        //starting is not sorted
        int end[] = {2,4,6,7,9,9};     

        int Activities[][] = new int[start.length][3];
        for(int i = 0; i<start.length; i++){
            Activities[i][0] = i;
            Activities[i][1] = start[i];
            Activities[i][2] = end[i];
        }

        //sorting of two dimensional array
        Arrays.sort(Activities, Comparator.comparingDouble(o -> o[2]));    //comparing and sorting the array based on end values, thats why we used o[2].
        
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(Activities[0][0]);
        int lastEnd = Activities[0][2];

       for(int i = 0; i<end.length; i++){
        //activity select
        if(Activities[i][1]>= lastEnd){
            ans.add(Activities[i][0]);
            maxAct++;
            lastEnd = Activities[i][2];
        }
       }
       for(int i = 0; i<ans.size(); i++){ 
        System.out.println("A"+ans.get(i));
        System.out.println(maxAct);
        }
    }
}
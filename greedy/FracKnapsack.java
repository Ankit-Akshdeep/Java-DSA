import java.util.*;
public class FracKnapsack{
    public static void main(String[] args) {
        int weight[] = {10,20,30};
        int val[] = {60,100,120};
        int W = 50;

        double ratio[][] = new double[val.length][2];   //to sort it
        //0 th column will have the index.; 1st column, item ratio
        
        for(int i = 0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];

        }

        //ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        double capacity = 50; int finalval = 0;
        //we want it in descending order, so we reverse the loop
        for(int i = ratio.length - 1; i>=0; i--){
            int idx = (int)ratio[i][0];          //the ratio will determine which will have a greater value and lower weight

            if(capacity>=weight[idx]){
                finalval += val[idx];
                capacity -= weight[idx];
            } else{
                //include fractional items
                finalval += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value = "+ finalval);
    }
}
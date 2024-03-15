import java.util.*;
public class PairSum1{

    //two pointer approach -->
    public static boolean Check(ArrayList<Integer> list, int target){
       int lp = 0; int rp = 5;
   
        while(lp!=rp){
          if(list.get(lp) + list.get(rp) == target){
            return true;
          }
          else if(list.get(lp) + list.get(rp)< target){
            lp++;
          }
          else{
            rp--;
          }
       }
       return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 
        list.add(6);
        
        int target = 4;
        
        System.out.println(Check(list, target));
    }
}
import java.util.*;
public class ContainsWater{
    
    // public static int MaxVol(ArrayList<Integer> height){
    //     int max = Integer.MIN_VALUE; int width; int hgt; int vol;
        
    //     //pairing everything//bruteforce  TC is O(n^2)
    //     for(int i = 0; i<height.size(); i++){
    //         for(int j = i+1; j<height.size(); j++){
    //             width = j-i;
    //             hgt = Math.min(height.get(i), height.get(j));
    //             vol = width* hgt;
    //             max = Math.max(max, vol);
    //         }
    //     }
    //     return max;
        
    // }

    //optimal solution- TC - O(n) Linear  --> two pointer approach
    public static int MaxWater(ArrayList<Integer> height){
      int max = Integer.MIN_VALUE; int vol; int width; int hgt; int lp =0; int rp = height.size() -1;

      while(lp<rp){
         width = rp - lp;
         hgt = Math.min(height.get(lp), height.get(rp));
         vol = width* hgt;
         max = Math.max(max, vol);

         if(height.get(lp)<height.get(rp)){
            lp++;
         } else{
            rp --;
         }
      }

      return max;
    }

    public static void main(String args[]){
       ArrayList<Integer> height = new ArrayList<>();
       height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4); height.add(8); height.add(3); height.add(7);
       
       System.out.println(MaxWater(height));
    }
}
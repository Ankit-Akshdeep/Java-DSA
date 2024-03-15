import java.util.*;
public class PairSum2{

    public static boolean check(ArrayList<Integer> list, int target){
     int bp = -1;  int n = list.size();
     //finding the breaking point
      for(int i = 0; i<n ; i++){
        if(list.get(i)>list.get(i+1)){
            bp = i;
            break;
        }
      }
      int lp = bp+1; int rp = bp;

     while(lp!=rp){
        //case 1
        if(list.get(lp)+ list.get(rp) == target){
            return true;
        }
        //case 2
        else if( list.get(lp)+ list.get(rp)<target){
            lp = (lp+1)%list.size();
        }
        //case 3
        else{
            rp = (rp+n-1)% list.size();
        }
     }
     return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11); list.add(15); list.add(6); list.add(8); list.add(9); list.add(10);
        int target = 16;

        System.out.println(check(list, target));

    }
}
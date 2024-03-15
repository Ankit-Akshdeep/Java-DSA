import java.util.*;
public class RevArraylist{
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(10); list.add(30); list.add(4);

        for(int i = list.size()-1; i>=0 ; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
//the time complexity is O(n). linear
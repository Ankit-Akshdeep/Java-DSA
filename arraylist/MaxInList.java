import java.util.*;
public class MaxInList{
    
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
         int temp = list.get(idx1);

         list.set(idx1, list.get(idx2));
         list.set(idx2, temp);
         System.out.println(list);
    }
    public static void main(String args[]){
        int idx1 =1, idx2 =3;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(5); list.add(9); list.add(3); list.add(6);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<list.size(); i++){
            // if(list.get(i)>max){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max is : " + max);

        swap(list, idx1, idx2);

        Collections.sort(list);
        System.out.println(list);
    }

// the time complexity of this program is O(n), linear, cuz the for loop runs through n elements of arraylist

//swapping of elements

}

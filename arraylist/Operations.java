import java.util.*;
public class Operations{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        //adding element
        list.add(1); list.add(2); list.add(3); list.add(4);
        System.out.println(list);

        //at an index --> list.add(index, element) // this add operation taked linear time not constant time, so the TC will be O(n).
        list.add(2,5);
        System.out.println(list);

        //get element
       int element =  list.get(2);
       System.out.println(element);

       //delete
       list.remove(2);
       System.out.println(list);

       //set
       list.set(2,10);
       System.out.println(list);

       //contains
       System.out.println(list.contains(2));

       //printing the arraylist.
       for(int i =0; i<list.size(); i++){
        System.out.print(list.get(i));
       }
    }
}
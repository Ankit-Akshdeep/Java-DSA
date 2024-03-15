import java.util.*;
public class MainArraylist{
    public static void main(String args[]){
        
    //     //creating main arraylist
    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    //     ArrayList<Integer> list = new ArrayList<>();

    //    list.add(2); list.add(2);
    //    mainList.add(list);

    //    ArrayList<Integer> list2 = new ArrayList<>();
    //    list2.add(4); list2.add(6);

    //    mainList.add(list2);

    //    for(int i = 0; i<mainList.size(); i++){
    //     ArrayList<Integer> currList = mainList.get(i);
    //     for(int j = 0; j<currList.size(); j++){
    //         System.out.print(currList.get(j) + " ");
    //     }
    //     System.out.println();
    //    }
    //    System.out.println(mainList);

     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
     ArrayList<Integer> ar1 = new ArrayList<>();
     ArrayList<Integer> ar2 = new ArrayList<>();
     ArrayList<Integer> ar3 = new ArrayList<>();

     for(int i = 1; i<=5; i++){
         ar1.add(i*1);
         ar2.add(i*2);
         ar3.add(i*3);
     }
     mainList.add(ar1);
     mainList.add(ar2);
     mainList.add(ar3);

     System.out.println(mainList);

    }
}
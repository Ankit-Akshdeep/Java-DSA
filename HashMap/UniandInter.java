import java.util.*;
public class UniandInter{
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //for union
        for (Integer i : arr1){
            set.add(i);
        }
        for (Integer i2 : arr2) {
            set.add(i2);
        }
        System.out.println(set.size());
        set.clear();

        //for intersection
        int c = 0;
        for (Integer i : arr1) {
            set.add(i);
        }
        for(int j = 0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                c++;
                set.remove(arr2[j]);
            }
        }
        System.out.println(c);
    }
}
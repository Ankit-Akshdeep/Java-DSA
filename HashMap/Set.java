import java.util.*;
public class Set{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(12);
        set.add(9); set.add(8);
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
import java.util.*;
public class LinkedListJCF{
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList();
        //add
        ll.addFirst(1); ll.addLast(2); ll.addLast(1);

        //print
        System.out.println(ll);
    }
}
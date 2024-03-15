import java.util.*;


public class ZigZag{
    public static class Node{
        int data; Node next;

        public Node(int data){
          this.data = data; this.next=null;
        }   
    }
    public static Node head;
    public static Node tail;

    public static void ZZ(LinkedList<Integer> l){
        //find mid
         Node slow = head; Node fast = head.next;
         while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         }
         Node mid = slow;
        //reverse second half
         Node curr = mid.next;
         mid.next = null;
         Node prev = null;
         Node next;

         while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }
         Node left = head;
         Node right = prev;
         Node nextL, nextR;
        
         //zigzag merge
          while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            left = nextL;
            right = nextR;
          }

    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 1); ll.add(1,  2); ll.add(2, 3); ll.add(3, 4); ll.add(4, 5);

        System.out.println(ll);
        ZZ(ll);
        System.out.println(ll);
    }
}
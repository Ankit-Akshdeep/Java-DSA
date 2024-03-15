import java.util.LinkedList;

public class LL{
    public static class Node{
         int data; Node next;

         public Node(int data){
           this.data = data; this.next=null;
         }
     }

    public static Node head; 
    public static Node tail;

    //check if cycle or not
 public static boolean isCycle(){
    Node slow=head , fast=head ;

    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
 }

 public static void removeCycle(){
    //detect cycle
    Node slow=head , fast=head ;
    boolean cycle = false;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            cycle = true;
            break;
        }
    }
    if(cycle == false){
        return;
    }
      //find meeting point
      slow = head; Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void ZZ(){    //zigzag ll
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
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
 public static void main(String[] args) {
     LinkedList ll = new LinkedList();
    // head = new Node(1);
    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node (5);
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());
    ZZ();
    printList(head);
 }
}
import java.util.*;
public class MergeSort{
    public static class Node{
        int data; Node next;

        public Node(int data){
          this.data = data; this.next=null;
        }   
    }
    public static Node head;
    public static Node tail;

    public static Node MS(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }  
        
        //find mid
           Node mid = getMid(head);
           
           //left and right MS
           Node rightHead= mid.next;
           mid.next = null;

           Node newright = MS(head);
           Node newleft = MS(rightHead);

           //merging
           return merge(newleft,newright);
    }

    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
            while (fast != null && fast.next!=null) {
           slow = slow.next;
           fast = fast.next.next;
    }
    return slow; //midNode
}

private static Node merge(Node head1, Node head2){
     Node mergedLL = new Node(-1);
     Node temp = mergedLL;
     while(head1!=null && head2!=null){
        if(head1.data <= head2.data){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
     }
     while(head1!=null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
     }
     while(head2!=null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
     }
     return mergedLL.next;
}
    
static void printList(Node head)
{
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
}

    public static void main(String[] args) {
        Node head = new Node(7);
        Node temp = head;
        temp.next = new Node(10);
        temp = temp.next;
        temp.next = new Node(5);
        temp = temp.next;
        temp.next = new Node(20);
        temp = temp.next;
        temp.next = new Node(3);
        temp = temp.next;
        temp.next = new Node(2);
        temp = temp.next;
  
       printList(head);
       head = MS(head);
       printList(head);
    }
}
import java.util.*;
public class Intersection{

    public static class Node{
          int data; Node next;

          public Node(int data){
            this.data=data; this.next = null;
          }
    }

    public static Node head1; public static Node head2; public static int size;

    public int getIntersection(Node head1, Node head2){
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2.data;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return -1;
    }
    public static void main(String[] args) {
       Intersection list = new Intersection();
        
        head1 = new Node(10);
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        
        System.out.println(list.getIntersection(head1,head2));
}
}
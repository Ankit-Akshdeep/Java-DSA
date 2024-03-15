import java.util.*;
public class QueueLinkedlist{
        
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        //isEmpty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public static void add(int data){
            Node newNode = new Node(data);

            //1st element added
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            //last element present
            int front = head.data;
            if(head == tail){
                head = null;
                tail = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //peek
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    
    public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1); q.add(2); q.add(3); 
            
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
}
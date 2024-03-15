public class LinkedList{
    public static class Node{
        int data;
        Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
 }
 public static Node head;
 public static Node tail;
 public static int size;

 public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;

 }

 public void addLast(int data){
    Node newNode = new Node(data);
    size++;

    if(head == null){
        head = tail = newNode;
        return;
    }
    
    tail.next = newNode;
    newNode = tail;
 }

 public void printLL(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->"+" ");
      temp = temp.next;
 }
 System.out.println();
}

 public void addElement(int idx, int data){
    Node newNode = new Node(data);
    size++;
    Node temp = head; int i = 0;
    while((i<idx-1)){
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
 }

 public int removeFirst(){
    if(size == 0){
        System.out.println("LinkedList is empty");
        return Integer.MIN_VALUE;
    }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        return val; 
    }
    int val = head.data;
    head = head.next;
    return val;
 }

 public int removeLast(){
    if(size == 0){
        System.out.println("Linked List is Empty");
        return Integer.MIN_VALUE;
    }
    else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    Node prev = head;
    for(int i = 0; i<size - 2; i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size --;
    return val;

 }

 public int itrSearch(int key){
    Node temp = head;
    int i =0;

    while(temp!=null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
 }
 public int helper(Node head, int key){
    if(head == null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
    int idx = helper(head.next,key);
    if(idx== -1){
        return -1;
    }
    return idx+1;
 }
 public int recSearch(int key){
    return helper(head,key);
 }

 public void reverse(){
    Node prev = head;
    Node curr = tail = head;
    Node next;

    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
 }

 public void deleteNthfromEnd(int n){
    int sz = 0;
    Node temp = head;
    while(temp!=null){
        temp = temp.next;
        sz++;
    }
   if(n == sz){
    head = head.next;
    return;
   }
   int i = 1;
   int iTofind = sz - n;
   Node prev = head;
   while(i<iTofind){
    prev = prev.next;
    i++;
   }
   prev.next = prev.next.next;
   return;
 }

    //check if cycle or not
    public boolean isCycle(){
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

     
 public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    // ll.addFirst(4); ll.addFirst(2); ll.addFirst(3); ll.addFirst(4);
    head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = head;
    // ll.printLL();
    System.out.println(ll.isCycle());

 }
}